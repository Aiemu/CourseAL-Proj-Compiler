import sys
from antlr4 import *

from CLexer import CLexer
from CParser import CParser
from CVisitor import CVisitor


class PYVisitor(CVisitor):
    def __init__(self):
        super().__init__()
        self.indent = 0

    def addIndent(self, resultList):
        if self.indent < 0:
            raise SyntaxError('indent error')
        print(resultList)
        return '\n'.join('\t' + i for i in resultList)

    def visitPrimaryExpression(self, ctx: CParser.PrimaryExpressionContext):
        if ctx.expression():
            return '(' + self.visit(ctx.Constant()) + ')'
        else:
            return ctx.getChild(0).getText()

    def visitPostfixExpression(self, ctx: CParser.PostfixExpressionContext):
        if ctx.primaryExpression():
            return self.visit(ctx.primaryExpression())
        if ctx.postfixExpression():
            if ctx.children[1].getText() == '[':
                pass
            elif ctx.children[1].getText() == '(':
                function = ctx.postfixExpression().getText()
                if function == 'strlen':
                    function = 'len'
                    return function + '(' + self.visit(ctx.argumentExpressionList()) + ')'
                elif function == 'printf':
                    args = self.visit(ctx.argumentExpressionList())
                    print(args)
                    return function + '(' + ',% '.join(args) + ')'
            elif ctx.children[1].getText() == '++':
                pass

    def visitArgumentExpressionList(self, ctx: CParser.ArgumentExpressionListContext):
        if ctx.assignmentExpression():
            return [self.visit(ctx.assignmentExpression())]
        else:
            return self.visit(ctx.argumentExpressionList().argumentExpressionList()) + [
                self.visit(ctx.assignmentExpression())]

    def visitUnaryExpression(self, ctx: CParser.UnaryExpressionContext):
        if ctx.unaryOperator():
            return self.visit(ctx.unaryOperator()) + self.visit(ctx.castExpression())
        elif ctx.getChild(0).getText() == '++':
            return self.visit(ctx.unaryOperator()) + '+= 1'
        elif ctx.getChild(0).getText() == '--':
            return self.visit(ctx.unaryOperator()) + '-= 1'
        elif ctx.postfixExpression():
            return self.visit(ctx.postfixExpression())

    def visitUnaryOperator(self, ctx: CParser.UnaryOperatorContext):
        pass

    def visitCastExpression(self, ctx: CParser.CastExpressionContext):
        if ctx.unaryExpression():
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
            self.visit(ctx.shiftExpression())

    def visitEqualityExpression(self, ctx: CParser.EqualityExpressionContext):
        if ctx.equalityExpression():
            if ctx.Equal():
                return self.visit(ctx.equalityExpression()) + ' == ' + self.visit(ctx.relationalExpression())
            elif ctx.NotEqual():
                return self.visit(ctx.equalityExpression()) + ' != ' + self.visit(ctx.relationalExpression())
            else:
                raise SyntaxError("equality expresssion error")
        else:
            self.visit(ctx.relationalExpression())

    def visitAndExpression(self, ctx: CParser.AndExpressionContext):
        if ctx.andExpression():
            return self.visit(ctx.andExpression()) + ' & ' + self.visit(ctx.equalityExpression())
        else:
            return self.visit(ctx.equalityExpression())

    def visitExclusiveOrExpression(self, ctx: CParser.ExclusiveOrExpressionContext):
        if ctx.exclusiveOrExpression():
            return self.visit(ctx.exclusiveOrExpression()) + ' ^ ' + self.visit(ctx.andExpression())
        else:
            return self.visit(ctx.andExpression())

    def visitInclusiveOrExpression(self, ctx: CParser.InclusiveOrExpressionContext):
        if ctx.inclusiveOrExpression():
            return self.visit(ctx.inclusiveOrExpression()) + ' | ' + self.visit(ctx.exclusiveOrExpression())
        else:
            return self.visit(ctx.exclusiveOrExpression())

    def visitLogicalAndExpression(self, ctx: CParser.LogicalAndExpressionContext):
        if ctx.logicalAndExpression():
            return self.visit(ctx.logicalAndExpression()) + ' and ' + self.visit(ctx.inclusiveOrExpression())
        else:
            return self.visit(ctx.inclusiveOrExpression())

    def visitLogicalOrExpression(self, ctx: CParser.LogicalOrExpressionContext):
        if ctx.logicalOrExpression():
            return self.visit(ctx.logicalOrExpression()) + ' or ' + self.visit(ctx.logicalAndExpression())
        else:
            return self.visit(ctx.logicalAndExpression())

    def visitConditionalExpression(self, ctx: CParser.ConditionalExpressionContext):
        return self.visitChildren(ctx)

    def visitAssignmentExpression(self, ctx: CParser.AssignmentExpressionContext):
        if ctx.unaryExpression():
            return self.visit(ctx.unaryExpression()) + self.visit(ctx.assignmentOperator()) \
                   + self.visit(ctx.assignmentExpression())
        else:
            return self.visit(ctx.conditionalExpression())

    def visitAssignmentOperator(self, ctx: CParser.AssignmentOperatorContext):
        return ctx.getText()

    def visitExpression(self, ctx: CParser.ExpressionContext):
        if ctx.expression():
            return self.visit(ctx.expression()) + self.visit(ctx.assignmentExpression())
        return self.visit(ctx.assignmentExpression())

    def visitConstantExpression(self, ctx: CParser.ConstantExpressionContext):
        if ctx.conditionalExpression():
            return self.visit(ctx.conditionalExpression())
        raise SyntaxError('constant expression error')

    def visitDeclaration(self, ctx: CParser.DeclarationContext):
        if isinstance(ctx.initDeclaratorList().initDeclarator(0).declarator(),
                      CParser.FunctionDefinitionOrDeclarationContext):
            # there is no function declaration in JS
            return ''
        if ctx.typeSpecifier():
            return self.visit(ctx.typeSpecifier()) + ' ' + self.visit(ctx.initDeclaratorList()) + ';'

    def visitInitDeclaratorList(self, ctx: CParser.InitDeclaratorListContext):
        if ctx.initDeclaratorList():
            return self.visit(ctx.initDeclaratorList()) + self.visit(ctx.initDeclarator())
        return self.visit(ctx.initDeclarator())

    def visitInitDeclarator(self, ctx: CParser.InitDeclaratorContext):
        if ctx.initializer():
            print(self.visit(ctx.initializer()))
            return self.visit(ctx.declarator()) + ' = ' + self.visit(ctx.initializer())
        else:
            return self.visit(ctx.declarator())

    def visitTypeSpecifier(self, ctx: CParser.TypeSpecifierContext):
        return 'def'

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
            return self.visit(ctx.typeSpecifier()) + self.visit(ctx.declarator())
        else:
            raise SyntaxError('parameter declaration error')

    def visitParameterDeclaration2(self, ctx: CParser.ParameterDeclarationContext):
        return self.visit(ctx.declarator())

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
        elif ctx.expression():
            return self.visit(ctx.expression())
        else:
            if ctx.getChild(0).getText() == 'return':
                if ctx.expression():
                    return 'return' + self.visit(ctx.expression())
                else:
                    return 'return'
            else:
                return ctx.getChild(0).getText()

    def visitLabeledStatement(self, ctx: CParser.LabeledStatementContext):
        # todo
        return ctx.getText()

    def visitCompoundStatement(self, ctx: CParser.CompoundStatementContext):
        self.indent += 1
        return '\n' + self.addIndent([self.visit(i) for i in ctx.children[1:-1]])

    def visitBlockItem(self, ctx: CParser.BlockItemContext):
        if ctx.statement():
            return self.visit(ctx.statement())
        return self.visit(ctx.declaration())

    def visitSelectionStatement(self, ctx: CParser.SelectionStatementContext):
        if ctx.children[0].getText() == 'if':
            self.indent += 1
            if_statements = f'if {self.visit(ctx.expression())}: \n' +\
                            self.addIndent([self.visit(i) for i in ctx.statement(0).compoundStatement().blockItem()])
            else_statement = ''
            if len(ctx.children) >= 5:
                self.indent += 1
                else_statement = '\nelse:\n' + \
                                 self.addIndent([self.visit(i) for i in ctx.statement(1).compoundStatement().blockItem()])
            return if_statements + else_statement

    def visitIterationStatement(self, ctx: CParser.IterationStatementContext):
        if ctx.getChild(0).getText() == 'for':
            forDeclaration = ctx.forDeclaration()
            forDeclaration = '' if not forDeclaration else self.visit(forDeclaration)
            forExpression_0 = ctx.forExpression(0)
            forExpression_0 = '' if not forExpression_0 else self.visit(forExpression_0)
            forExpression_1 = ctx.forExpression(1)
            forExpression_1 = '' if not forExpression_1 else self.visit(forExpression_1)
            ans = f'{forDeclaration}' + '\n' + f'while {forExpression_0}:\n'
            self.indent += 1
            return ans + self.addIndent(
                f'\n'.join([self.visit(i) for i in ctx.statement().compoundStatement().blockItem()])
                + f'\n{forExpression_1}')
        elif ctx.getChild(0).getText() == 'While':
            ans = f'while {self.visit(ctx.expression())}:\n'
            self.indent += 1
            return ans + self.addIndent(
                '\n'.join([self.visit(i) for i in ctx.statement().compoundStatement().blockItem()]))

    def visitForDeclaration(self, ctx: CParser.ForDeclarationContext):
        return self.visit(ctx.typeSpecifier()) + ' ' + self.visit(ctx.initDeclaratorList())

    def visitForExpression(self, ctx: CParser.ForExpressionContext):
        if ctx.forExpression():
            return self.visit(ctx.forExpression()) + self.visit(ctx.assignmentExpression())
        else:
            return self.visit(ctx.assignmentExpression())

    def visitCompilationUnit(self, ctx: CParser.CompilationUnitContext):
        ans = [self.visit(i) for i in ctx.children]
        ans = [x for x in ans if x]
        return '\n'.join(ans) + '\n\nif __name__ == \'__main__\': \n\tmain()\n'

    def visitFunctionDefinition(self, ctx: CParser.FunctionDefinitionContext):
        function_defination = self.visit(ctx.typeSpecifier())
        self.indent += 1
        if ctx.declarator():
            function_defination += ' ' + self.visit(ctx.declarator()) + ':\n'
        ans = [self.visit(i) for i in ctx.compoundStatement().blockItem()]
        return function_defination + self.addIndent(ans)


def main(argv):
    input = FileStream('testKMP.c' if len(argv) <= 1 else argv[1])
    lexer = CLexer(input)
    stream = CommonTokenStream(lexer)
    parser = CParser(stream)
    tree = parser.compilationUnit()
    ans = PYVisitor().visit(tree)
    outfile = open('test.py' if len(argv) <= 2 else argv[2], 'w', encoding='utf-8')
    outfile.write(ans)
    outfile.close()
    print(ans)


if __name__ == '__main__':
    main(sys.argv)
