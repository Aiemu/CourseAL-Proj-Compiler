# Generated from C.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CParser import CParser
else:
    from CParser import CParser

# This class defines a complete generic visitor for a parse tree produced by CParser.

class CVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:CParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#postfixExpression.
    def visitPostfixExpression(self, ctx:CParser.PostfixExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#argumentExpressionList.
    def visitArgumentExpressionList(self, ctx:CParser.ArgumentExpressionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#unaryExpression.
    def visitUnaryExpression(self, ctx:CParser.UnaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#unaryOperator.
    def visitUnaryOperator(self, ctx:CParser.UnaryOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#castExpression.
    def visitCastExpression(self, ctx:CParser.CastExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:CParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:CParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#shiftExpression.
    def visitShiftExpression(self, ctx:CParser.ShiftExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#relationalExpression.
    def visitRelationalExpression(self, ctx:CParser.RelationalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#equalityExpression.
    def visitEqualityExpression(self, ctx:CParser.EqualityExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#andExpression.
    def visitAndExpression(self, ctx:CParser.AndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#exclusiveOrExpression.
    def visitExclusiveOrExpression(self, ctx:CParser.ExclusiveOrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#inclusiveOrExpression.
    def visitInclusiveOrExpression(self, ctx:CParser.InclusiveOrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#logicalAndExpression.
    def visitLogicalAndExpression(self, ctx:CParser.LogicalAndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#logicalOrExpression.
    def visitLogicalOrExpression(self, ctx:CParser.LogicalOrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#conditionalExpression.
    def visitConditionalExpression(self, ctx:CParser.ConditionalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#assignmentExpression.
    def visitAssignmentExpression(self, ctx:CParser.AssignmentExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#assignmentOperator.
    def visitAssignmentOperator(self, ctx:CParser.AssignmentOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#expression.
    def visitExpression(self, ctx:CParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#constantExpression.
    def visitConstantExpression(self, ctx:CParser.ConstantExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#pureIdentifier.
    def visitPureIdentifier(self, ctx:CParser.PureIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#arrayIdentifier.
    def visitArrayIdentifier(self, ctx:CParser.ArrayIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#functionDefinitionOrDeclaration.
    def visitFunctionDefinitionOrDeclaration(self, ctx:CParser.FunctionDefinitionOrDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#declaration.
    def visitDeclaration(self, ctx:CParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#initDeclaratorList.
    def visitInitDeclaratorList(self, ctx:CParser.InitDeclaratorListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#initDeclarator.
    def visitInitDeclarator(self, ctx:CParser.InitDeclaratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#typeSpecifier.
    def visitTypeSpecifier(self, ctx:CParser.TypeSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#typeName.
    def visitTypeName(self, ctx:CParser.TypeNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#enumSpecifier.
    def visitEnumSpecifier(self, ctx:CParser.EnumSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#enumeratorList.
    def visitEnumeratorList(self, ctx:CParser.EnumeratorListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#enumerator.
    def visitEnumerator(self, ctx:CParser.EnumeratorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#enumerationConstant.
    def visitEnumerationConstant(self, ctx:CParser.EnumerationConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#pointer.
    def visitPointer(self, ctx:CParser.PointerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#parameterTypeList.
    def visitParameterTypeList(self, ctx:CParser.ParameterTypeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#parameterList.
    def visitParameterList(self, ctx:CParser.ParameterListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#parameterDeclaration.
    def visitParameterDeclaration(self, ctx:CParser.ParameterDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#initializer.
    def visitInitializer(self, ctx:CParser.InitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#initializerList.
    def visitInitializerList(self, ctx:CParser.InitializerListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#statement.
    def visitStatement(self, ctx:CParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#labeledStatement.
    def visitLabeledStatement(self, ctx:CParser.LabeledStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#compoundStatement.
    def visitCompoundStatement(self, ctx:CParser.CompoundStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#blockItem.
    def visitBlockItem(self, ctx:CParser.BlockItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#selectionStatement.
    def visitSelectionStatement(self, ctx:CParser.SelectionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#iterationStatement.
    def visitIterationStatement(self, ctx:CParser.IterationStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#forDeclaration.
    def visitForDeclaration(self, ctx:CParser.ForDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#forExpression.
    def visitForExpression(self, ctx:CParser.ForExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#compilationUnit.
    def visitCompilationUnit(self, ctx:CParser.CompilationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CParser#functionDefinition.
    def visitFunctionDefinition(self, ctx:CParser.FunctionDefinitionContext):
        return self.visitChildren(ctx)



del CParser