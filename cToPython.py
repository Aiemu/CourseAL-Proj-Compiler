import sys
from antlr4 import *
from os import listdir
from os.path import isfile, join

from CLexer import CLexer
from CParser import CParser
from CVisitor import CVisitor

INIT = 'INIT'
FUNCTION = 'FUNCTION'
FOR = 'FOR'
WHILE = 'WHILE'

class PYVisitor(CVisitor):
    def __init__(self):
        super().__init__()
        self.indent = 0
        self.inState = []
        self.forIndent = -1
        self.forExpression = []

    def addIndent(self, result):
        if self.indent < 0:
            raise SyntaxError('indent error')
        # print(result)
        return '\n'.join('\t' + i for i in result.split('\n'))

    def visitPrimaryExpression(self, ctx: CParser.PrimaryExpressionContext):
        if ctx.expression():
            return '(' + self.visit(ctx.expression()) + ')'
        elif ctx.Constant():
            # print('primary:', ctx.Constant().getText())
            return ctx.Constant().getText()
        elif ctx.StringLiteral():
            return ''.join(i.getText() for i in ctx.StringLiteral())
        elif ctx.Identifier():
            return ctx.Identifier().getText()

    def visitPostfixExpression(self, ctx: CParser.PostfixExpressionContext):
        if ctx.primaryExpression():
            # print("postfix expression")
            return self.visit(ctx.primaryExpression())
        if ctx.postfixExpression():
            if ctx.children[1].getText() == '[':
                return self.visit(ctx.postfixExpression()) + '[' + self.visit(ctx.expression()) + ']'
            elif ctx.children[1].getText() == '(':
                function = ctx.postfixExpression().getText()
                if function == 'strlen':
                    function = 'len'
                    return function + '(' + ', '.join(self.visit(ctx.argumentExpressionList())) + ')'
                elif function == 'printf':
                    args = self.visit(ctx.argumentExpressionList())
                    # print('args', type(args), ' ', args)
                    return 'print(' + ' % '.join([('(%s)' % i)if args.index(i) != 0 else i for i in args ]) + ')'
                else:
                    return function + '(' + ')'
            elif ctx.PlusPlus():
                return self.visit(ctx.postfixExpression()) + ' += 1'
            elif ctx.MinusMinus():
                return self.visit(ctx.postfixExpression()) + ' -= 1'


    def visitArgumentExpressionList(self, ctx: CParser.ArgumentExpressionListContext):
        if ctx.argumentExpressionList():
            return self.visit(ctx.argumentExpressionList()) + [self.visit(ctx.assignmentExpression())]
        else:
            return [self.visit(ctx.assignmentExpression())]

    def visitUnaryExpression(self, ctx: CParser.UnaryExpressionContext):
        if ctx.unaryOperator():
            return self.visit(ctx.unaryOperator()) + self.visit(ctx.castExpression())
        elif ctx.PlusPlus():
            return self.visit(ctx.unaryExpression()) + ' += 1'
        elif ctx.getChild(0).getText() == '--':
            return self.visit(ctx.unaryExpression()) + ' -= 1'
        elif ctx.postfixExpression():
            return self.visit(ctx.postfixExpression())

    def visitUnaryOperator(self, ctx: CParser.UnaryOperatorContext):
        return ctx.getText()

    def visitCastExpression(self, ctx: CParser.CastExpressionContext):
        if ctx.unaryExpression():
            # print('cast expression:')
            return self.visit(ctx.unaryExpression())
        elif ctx.typeName():
            if ctx.typeName().getText() == 'int' or ctx.typeName().getText() == 'float':
                return ctx.typeName().getText() + self.visit(ctx.castExpression())
            else:
                raise SyntaxError('the typename %s in castExpression is not supported' % ctx.typeName().getText())
        else:
            raise SyntaxError('this castExpression is not supported')

    def visitMultiplicativeExpression(self, ctx: CParser.MultiplicativeExpressionContext):
        if ctx.multiplicativeExpression():
            return self.visit(ctx.multiplicativeExpression()) + ctx.getChild(1).getText() + self.visit(
                ctx.castExpression())
        else:
            # print('multiple expression:')
            return self.visit(ctx.castExpression())

    def visitAdditiveExpression(self, ctx: CParser.AdditiveExpressionContext):
        if ctx.additiveExpression():
            return self.visit(ctx.additiveExpression()) + ctx.getChild(1).getText() + self.visit(
                ctx.multiplicativeExpression())
        else:
            return self.visit(ctx.multiplicativeExpression())

    def visitShiftExpression(self, ctx: CParser.ShiftExpressionContext):
        if ctx.shiftExpression():
            return self.visit(ctx.shiftExpression()) + ctx.getChild(1).getText() + self.visit(ctx.additiveExpression())
        else:
            return self.visit(ctx.additiveExpression())

    def visitRelationalExpression(self, ctx: CParser.RelationalExpressionContext):
        if ctx.relationalExpression():
            return self.visit(ctx.relationalExpression()) + ctx.getChild(1).getText() + self.visit(
                ctx.shiftExpression())
        else:
            return self.visit(ctx.shiftExpression())

    def visitEqualityExpression(self, ctx: CParser.EqualityExpressionContext):
        if ctx.equalityExpression():
            if ctx.Equal():
                return self.visit(ctx.equalityExpression()) + ' == ' + self.visit(ctx.relationalExpression())
            elif ctx.NotEqual():
                return self.visit(ctx.equalityExpression()) + ' != ' + self.visit(ctx.relationalExpression())
            else:
                raise SyntaxError("equality expresssion error")
        else:
            result = self.visit(ctx.relationalExpression())
            # print('equality:', result)
            return result

    def visitAndExpression(self, ctx: CParser.AndExpressionContext):
        if ctx.andExpression():
            return self.visit(ctx.andExpression()) + ' & ' + self.visit(ctx.equalityExpression())
        else:
            result =self.visit(ctx.equalityExpression())
            # print('and:', result)
            return result

    def visitExclusiveOrExpression(self, ctx: CParser.ExclusiveOrExpressionContext):
        if ctx.exclusiveOrExpression():
            return self.visit(ctx.exclusiveOrExpression()) + ' ^ ' + self.visit(ctx.andExpression())
        else:
            result = self.visit(ctx.andExpression())
            # print('exclusive or:', result)
            return result

    def visitInclusiveOrExpression(self, ctx: CParser.InclusiveOrExpressionContext):
        if ctx.inclusiveOrExpression():
            return self.visit(ctx.inclusiveOrExpression()) + ' | ' + self.visit(ctx.exclusiveOrExpression())
        else:
            result = self.visit(ctx.exclusiveOrExpression())
            # print('inclusive or:', result)
            return result

    def visitLogicalAndExpression(self, ctx: CParser.LogicalAndExpressionContext):
        if ctx.logicalAndExpression():
            return self.visit(ctx.logicalAndExpression()) + ' and ' + self.visit(ctx.inclusiveOrExpression())
        else:
            result = self.visit(ctx.inclusiveOrExpression())
            # print('logical and:', result)
            return result

    def visitLogicalOrExpression(self, ctx: CParser.LogicalOrExpressionContext):
        if ctx.logicalOrExpression():
            return self.visit(ctx.logicalOrExpression()) + ' or ' + self.visit(ctx.logicalAndExpression())
        else:
            result =self.visit(ctx.logicalAndExpression())
            # print('logical or:', result)
            return result

    def visitConditionalExpression(self, ctx: CParser.ConditionalExpressionContext):
        if ctx.expression():
            return self.visit(ctx.logicalOrExpression()) + self.visit(ctx.expression()) + self.visit(ctx.conditionalExpression())
        else:
            result = self.visit(ctx.logicalOrExpression())
            # print('conditional expression:', result)
            return result

    def visitAssignmentExpression(self, ctx: CParser.AssignmentExpressionContext):
        if ctx.unaryExpression():
            return self.visit(ctx.unaryExpression()) + self.visit(ctx.assignmentOperator()) \
                   + self.visit(ctx.assignmentExpression())
        else:
            result = self.visit(ctx.conditionalExpression())
            # print('assignment expression:', result)
            return result

    def visitAssignmentOperator(self, ctx: CParser.AssignmentOperatorContext):
        return ctx.getText()

    def visitExpression(self, ctx: CParser.ExpressionContext):
        if ctx.expression():
            return self.visit(ctx.expression()) + self.visit(ctx.assignmentExpression())
        result = self.visit(ctx.assignmentExpression())
        # print('expression:', result)
        return result

    def visitConstantExpression(self, ctx: CParser.ConstantExpressionContext):
        if ctx.conditionalExpression():
            return self.visit(ctx.conditionalExpression())
        raise SyntaxError('constant expression error')

    def visitDeclaration(self, ctx: CParser.DeclarationContext):
        if ctx.typeSpecifier():
            return self.visit(ctx.typeSpecifier()) + self.visit(ctx.initDeclaratorList())

    def visitInitDeclaratorList(self, ctx: CParser.InitDeclaratorListContext):
        if ctx.initDeclaratorList():
            return self.visit(ctx.initDeclaratorList())  + '\n' + self.visit(ctx.initDeclarator())
        return self.visit(ctx.initDeclarator())

    def visitInitDeclarator(self, ctx: CParser.InitDeclaratorContext):
        if ctx.initializer():
            # print(self.visit(ctx.initializer()))
            return self.visit(ctx.declarator().getChild(0)) + ' = ' + self.visit(ctx.initializer())
        else:
            # 数组定义 其余定义若无初始值可以省略
            if ctx.declarator().getText()[-1] == ']':
                return self.visit(ctx.declarator().getChild(0)) + ' = [0] * %s' % self.visit(ctx.declarator().getChild(2))
            else:
                return ''

    def visitTypeSpecifier(self, ctx: CParser.TypeSpecifierContext):
        return ''

    def visitEnumSpecifier(self, ctx: CParser.EnumSpecifierContext):
        return self.visitChildren(ctx)

    def visitEnumeratorList(self, ctx: CParser.EnumeratorListContext):
        return self.visitChildren(ctx)

    def visitEnumerator(self, ctx: CParser.EnumeratorContext):
        return self.visitChildren(ctx)

    def visitEnumerationConstant(self, ctx: CParser.EnumerationConstantContext):
        return self.visitChildren(ctx)

    def visitPointer(self, ctx: CParser.PointerContext):
        return self.visitChildren(ctx)

    def visitParameterTypeList(self, ctx: CParser.ParameterTypeListContext):
        return ', '.join([self.visitParameterDeclaration2(x) for x in ctx.parameterList().parameterDeclaration()])

    def visitParameterList(self, ctx: CParser.ParameterListContext):
        if ctx.parameterList():
            return self.visit(ctx.parameterList()) + self.visit(ctx.parameterDeclaration())
        else:
            return self.visit(ctx.parameterDeclaration())

    def visitParameterDeclaration(self, ctx: CParser.ParameterDeclarationContext):
        if ctx.typeSpecifier() and ctx.declarator():
            return self.visit(ctx.typeSpecifier()) + ''.join([self.visit(i) for i in ctx.declarator().children])
        else:
            raise SyntaxError('parameter declaration error')

    def visitParameterDeclaration2(self, ctx: CParser.ParameterDeclarationContext):
        return ''.join([self.visit(i) for i in ctx.declarator().children])

    def visitTypeName(self, ctx: CParser.TypeNameContext):
        return ctx.getText()

    def visitInitializer(self, ctx: CParser.InitializerContext):
        if ctx.assignmentExpression():
            return self.visit(ctx.assignmentExpression())
        elif ctx.initializerList():
            return '[' + self.visit(ctx.initializerList()) + ']'
        return '[]'

    def visitInitializerList(self, ctx: CParser.InitializerListContext):
        return ', '.join([self.visit(x) for x in ctx.initializer()])

    def visitStatement(self, ctx: CParser.StatementContext):
        if ctx.labeledStatement():
            return self.visit(ctx.labeledStatement())
        elif ctx.compoundStatement():
            return self.visit(ctx.compoundStatement())
        elif ctx.selectionStatement():
            return self.visit(ctx.selectionStatement())
        elif ctx.iterationStatement():
            return self.visit(ctx.iterationStatement())
        elif ctx.expression() and len(ctx.children) < 3:
            return self.visit(ctx.expression())
        else:
            if ctx.Return() == 'return':
                if ctx.expression():
                    # print('return')
                    return 'return ' + self.visit(ctx.expression())
                else:
                    return 'return'
            elif ctx.Continue():
                if self.forIndent > -1 and self.inState[-1] == FOR:
                    if self.forExpression[self.forIndent]:
                        return self.forExpression[self.forIndent] + '\n' + ctx.Continue().getText()
                    else:
                        return ctx.Continue().getText()
                else:
                    return ctx.Continue().getText()
            else:
                return ctx.getChild(0).getText()

    def visitLabeledStatement(self, ctx: CParser.LabeledStatementContext):
        # todo
        return ctx.getText()

    def visitCompoundStatement(self, ctx: CParser.CompoundStatementContext):
        self.indent += 1
        return '\n' + self.addIndent('\n'.join([self.visit(i) for i in ctx.children[1:-1]]))

    def visitBlockItem(self, ctx: CParser.BlockItemContext):
        if ctx.statement():
            return self.visit(ctx.statement())
        return self.visit(ctx.declaration())

    def visitSelectionStatement(self, ctx: CParser.SelectionStatementContext):
        if ctx.children[0].getText() == 'if':
            self.indent += 1
            if_statements = f'if {self.visit(ctx.expression())}: \n' + \
                            self.addIndent('\n'.join([self.visit(i) for i in ctx.statement(0).compoundStatement().blockItem()]))
            else_statement = ''
            if len(ctx.children) > 5:
                self.indent += 1
                else_statement = '\nelse:\n' + \
                                 self.addIndent('\n'.join([self.visit(i) for i in ctx.statement(1).compoundStatement().blockItem()]))
            return if_statements + else_statement

    def visitIterationStatement(self, ctx: CParser.IterationStatementContext):
        if ctx.getChild(0).getText() == 'for':
            forDeclaration = ctx.forDeclaration()
            forDeclaration = '' if not forDeclaration else self.visit(forDeclaration)
            forExpression_0 = ctx.forExpression(0)
            forExpression_0 = '' if not forExpression_0 else self.visit(forExpression_0)
            forExpression_1 = ctx.forExpression(1)
            forExpression_1 = '' if not forExpression_1 else self.visit(forExpression_1)
            ans = forDeclaration + '\n' + f'while {forExpression_0}:\n'
            self.inState.append(FOR)
            self.forIndent += 1
            self.forExpression.append(forExpression_1)
            self.indent += 1
            ans += self.addIndent('\n'.join(
                [self.visit(i) for i in ctx.statement().compoundStatement().blockItem()] + [forExpression_1]))
            self.forIndent -= 1
            self.forExpression.pop()
            self.inState.pop()
            return ans
        elif ctx.getChild(0).getText() == 'while':
            self.inState.append(WHILE)
            ans = f'while {self.visit(ctx.expression())}:\n'
            self.indent += 1
            ans += self.addIndent(
                '\n'.join([self.visit(i) for i in ctx.statement().compoundStatement().blockItem()]))
            self.inState.pop()
            return ans

    def visitForDeclaration(self, ctx: CParser.ForDeclarationContext):
        return self.visit(ctx.typeSpecifier()) + self.visit(ctx.initDeclaratorList())

    def visitForExpression(self, ctx: CParser.ForExpressionContext):
        if ctx.forExpression():
            return self.visit(ctx.forExpression()) + self.visit(ctx.assignmentExpression())
        else:
            return self.visit(ctx.assignmentExpression())

    def visitCompilationUnit(self, ctx: CParser.CompilationUnitContext):
        ans = [self.visit(i) for i in ctx.children[:-1]]
        ans = [x for x in ans if x]
        return '\n'.join(ans) + '\n\nif __name__ == \'__main__\': \n\tmain()\n'

    def visitFunctionDefinition(self, ctx: CParser.FunctionDefinitionContext):
        function_defination = 'def '
        self.indent += 1
        if ctx.declarator():
            function_defination += ''.join([self.visit(i) for i in ctx.declarator().children]) + ':\n'
        ans = '\n'.join([self.visit(i) for i in ctx.compoundStatement().blockItem()])
        return '\n\n' + function_defination + self.addIndent(ans)

    def visitTerminal(self, node):
        return node.getText()


def main():
    files = [join('./testFiles', f) for f in listdir('./testFiles') if isfile(join('./testFiles', f))]
    for file in files:
        lexer = CLexer(FileStream(file))
        stream = CommonTokenStream(lexer)
        parser = CParser(stream)
        tree = parser.compilationUnit()
        ans = PYVisitor().visit(tree)

        with open('./output/' + file.split('/')[-1].split('.')[0] + '.py', 'w') as output:
            output.write(ans)
            output.close()


if __name__ == '__main__':
    main()
