// Generated from /Users/aiemu/Documents/01_Codes/01_CurrentCourse/01_AssemblyLanguage/CourseAL_Proj_Com/C.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, CONST=34, POINTER=35, Identifier=36, Constant=37, 
		DigitSequence=38, StringLiteral=39, Whitespace=40, Newline=41, BlockComment=42, 
		LineComment=43;
	public static final int
		RULE_compilationUnit = 0, RULE_functionDefinition = 1, RULE_typeSpecifier = 2, 
		RULE_declarator = 3, RULE_statement = 4, RULE_forDeclaration = 5, RULE_forExpression = 6, 
		RULE_compoundStatement = 7, RULE_blockItem = 8, RULE_declaration = 9, 
		RULE_initDeclaratorList = 10, RULE_initDeclarator = 11, RULE_primaryExpression = 12, 
		RULE_postfixExpression = 13, RULE_castExpression = 14, RULE_unaryExpression = 15, 
		RULE_relationalExpression = 16, RULE_equalityExpression = 17, RULE_logicalAndExpression = 18, 
		RULE_logicalOrExpression = 19, RULE_assignmentExpression = 20, RULE_expression = 21, 
		RULE_parameterTypeList = 22, RULE_parameterList = 23, RULE_parameterDeclaration = 24, 
		RULE_initializer = 25, RULE_initializerList = 26;
	public static final String[] ruleNames = {
		"compilationUnit", "functionDefinition", "typeSpecifier", "declarator", 
		"statement", "forDeclaration", "forExpression", "compoundStatement", "blockItem", 
		"declaration", "initDeclaratorList", "initDeclarator", "primaryExpression", 
		"postfixExpression", "castExpression", "unaryExpression", "relationalExpression", 
		"equalityExpression", "logicalAndExpression", "logicalOrExpression", "assignmentExpression", 
		"expression", "parameterTypeList", "parameterList", "parameterDeclaration", 
		"initializer", "initializerList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'void'", "'char'", "'['", "']'", "'('", "')'", "';'", 
		"'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", 
		"','", "'{'", "'}'", "'='", "'/'", "'-'", "'+'", "'++'", "'--'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'...'", "'const'", 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "CONST", "POINTER", 
		"Identifier", "Constant", "DigitSequence", "StringLiteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << CONST))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(54);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(55);
					declaration();
					}
					break;
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			typeSpecifier();
			setState(64);
			declarator();
			setState(65);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CParser.CONST, 0); }
		public TerminalNode POINTER() { return getToken(CParser.POINTER, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(67);
				match(CONST);
				}
			}

			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINTER) {
				{
				setState(71);
				match(POINTER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	 
		public DeclaratorContext() { }
		public void copyFrom(DeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIdentifierContext extends DeclaratorContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArrayIdentifierContext(DeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionDefinitionOrDeclarationContext extends DeclaratorContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public FunctionDefinitionOrDeclarationContext(DeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class PureIdentifierContext extends DeclaratorContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public PureIdentifierContext(DeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarator);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PureIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new ArrayIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(Identifier);
				setState(76);
				match(T__3);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(77);
					assignmentExpression();
					}
				}

				setState(80);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new FunctionDefinitionOrDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(Identifier);
				setState(82);
				match(T__5);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << CONST))) != 0)) {
					{
					setState(83);
					parameterTypeList();
					}
				}

				setState(86);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				compoundStatement();
				}
				break;
			case T__22:
			case T__23:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				expression();
				setState(91);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__8);
				setState(94);
				match(T__5);
				setState(95);
				expression();
				setState(96);
				match(T__6);
				setState(97);
				statement();
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(98);
					match(T__9);
					setState(99);
					statement();
					}
					break;
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(T__10);
				setState(103);
				match(T__5);
				setState(104);
				expression();
				setState(105);
				match(T__6);
				setState(106);
				statement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(T__11);
				setState(109);
				match(T__5);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << CONST))) != 0)) {
					{
					setState(110);
					forDeclaration();
					}
				}

				setState(113);
				match(T__7);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(114);
					forExpression();
					}
				}

				setState(117);
				match(T__7);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(118);
					forExpression();
					}
				}

				setState(121);
				match(T__6);
				setState(122);
				statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(T__12);
				setState(124);
				match(T__7);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(T__13);
				setState(126);
				match(T__7);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				match(T__14);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(128);
					expression();
					}
				}

				setState(131);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			typeSpecifier();
			setState(135);
			initDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			assignmentExpression();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(138);
				match(T__15);
				setState(139);
				assignmentExpression();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__16);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << CONST) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(146);
				blockItem();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockItem);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__16:
			case T__22:
			case T__23:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				statement();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			typeSpecifier();
			setState(159);
			initDeclaratorList();
			setState(160);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			initDeclarator();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(163);
				match(T__15);
				setState(164);
				initDeclarator();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initDeclarator);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				declarator();
				setState(172);
				match(T__18);
				setState(173);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public TerminalNode StringLiteral() { return getToken(CParser.StringLiteral, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Constant) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						match(T__3);
						setState(184);
						expression();
						setState(185);
						match(T__4);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(187);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(188);
						match(T__5);
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
							{
							setState(189);
							expression();
							}
						}

						setState(192);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		return castExpression(0);
	}

	private CastExpressionContext castExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, _parentState);
		CastExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_castExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(199);
				unaryExpression();
				}
				break;
			case DigitSequence:
				{
				setState(200);
				match(DigitSequence);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new CastExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_castExpression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==POINTER) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						castExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new CastExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_castExpression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						castExpression(2);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unaryExpression);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				postfixExpression(0);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__22);
				setState(216);
				postfixExpression(0);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(T__23);
				setState(218);
				postfixExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpression);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				castExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				castExpression(0);
				setState(223);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				castExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			relationalExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(T__28);
						setState(233);
						relationalExpression();
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(T__29);
						setState(236);
						relationalExpression();
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(243);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(245);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(246);
					match(T__30);
					setState(247);
					equalityExpression(0);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(254);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(256);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(257);
					match(T__31);
					setState(258);
					equalityExpression(0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				logicalAndExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				logicalOrExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				unaryExpression();
				setState(267);
				match(T__18);
				setState(268);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			assignmentExpression();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(273);
				match(T__15);
				setState(274);
				assignmentExpression();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			parameterList();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(281);
				match(T__15);
				setState(282);
				match(T__32);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			parameterDeclaration();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(T__15);
					setState(287);
					parameterDeclaration();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			typeSpecifier();
			setState(294);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initializer);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				assignmentExpression();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__16);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(298);
					initializerList();
					}
				}

				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(301);
					match(T__15);
					}
				}

				setState(304);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			initializer();
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(T__15);
					setState(309);
					initializer();
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 14:
			return castExpression_sempred((CastExpressionContext)_localctx, predIndex);
		case 17:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 18:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 19:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean castExpression_sempred(CastExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\5\4G\n\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\5\5Q\n"+
		"\5\3\5\3\5\3\5\3\5\5\5W\n\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3"+
		"\6\3\6\5\6v\n\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084"+
		"\n\6\3\6\5\6\u0087\n\6\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b"+
		"\u0092\13\b\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\t\3\t\3\n\3\n"+
		"\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f"+
		"\u00ab\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1\n\17\3\17\7\17\u00c4"+
		"\n\17\f\17\16\17\u00c7\13\17\3\20\3\20\3\20\5\20\u00cc\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00d4\n\20\f\20\16\20\u00d7\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f0\n\23\f\23"+
		"\16\23\u00f3\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00fb\n\24\f\24"+
		"\16\24\u00fe\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0106\n\25\f\25"+
		"\16\25\u0109\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0111\n\26\3\27"+
		"\3\27\3\27\7\27\u0116\n\27\f\27\16\27\u0119\13\27\3\30\3\30\3\30\5\30"+
		"\u011e\n\30\3\31\3\31\3\31\7\31\u0123\n\31\f\31\16\31\u0126\13\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\5\33\u012e\n\33\3\33\5\33\u0131\n\33\3\33\5"+
		"\33\u0134\n\33\3\34\3\34\3\34\7\34\u0139\n\34\f\34\16\34\u013c\13\34\3"+
		"\34\2\7\34\36$&(\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\7\3\2\3\5\4\2&\'))\4\2\26\26%%\3\2\27\30\3\2\33\36\2\u0151"+
		"\2<\3\2\2\2\4A\3\2\2\2\6F\3\2\2\2\bY\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3"+
		"\2\2\2\16\u008b\3\2\2\2\20\u0093\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2"+
		"\2\2\26\u00a4\3\2\2\2\30\u00b1\3\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2"+
		"\2\36\u00cb\3\2\2\2 \u00dd\3\2\2\2\"\u00e4\3\2\2\2$\u00e6\3\2\2\2&\u00f4"+
		"\3\2\2\2(\u00ff\3\2\2\2*\u0110\3\2\2\2,\u0112\3\2\2\2.\u011a\3\2\2\2\60"+
		"\u011f\3\2\2\2\62\u0127\3\2\2\2\64\u0133\3\2\2\2\66\u0135\3\2\2\28;\5"+
		"\4\3\29;\5\24\13\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\3\3\2\2\2AB\5\6\4\2BC\5\b\5\2CD\5\20\t"+
		"\2D\5\3\2\2\2EG\7$\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HJ\t\2\2\2IK\7%\2"+
		"\2JI\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LZ\7&\2\2MN\7&\2\2NP\7\6\2\2OQ\5*\26"+
		"\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RZ\7\7\2\2ST\7&\2\2TV\7\b\2\2UW\5.\30"+
		"\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7\t\2\2YL\3\2\2\2YM\3\2\2\2YS\3\2\2"+
		"\2Z\t\3\2\2\2[\u0087\5\20\t\2\\]\5,\27\2]^\7\n\2\2^\u0087\3\2\2\2_`\7"+
		"\13\2\2`a\7\b\2\2ab\5,\27\2bc\7\t\2\2cf\5\n\6\2de\7\f\2\2eg\5\n\6\2fd"+
		"\3\2\2\2fg\3\2\2\2g\u0087\3\2\2\2hi\7\r\2\2ij\7\b\2\2jk\5,\27\2kl\7\t"+
		"\2\2lm\5\n\6\2m\u0087\3\2\2\2no\7\16\2\2oq\7\b\2\2pr\5\f\7\2qp\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2su\7\n\2\2tv\5\16\b\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2wy\7\n\2\2xz\5\16\b\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\t\2\2|\u0087"+
		"\5\n\6\2}~\7\17\2\2~\u0087\7\n\2\2\177\u0080\7\20\2\2\u0080\u0087\7\n"+
		"\2\2\u0081\u0083\7\21\2\2\u0082\u0084\5,\27\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7\n\2\2\u0086[\3\2\2\2"+
		"\u0086\\\3\2\2\2\u0086_\3\2\2\2\u0086h\3\2\2\2\u0086n\3\2\2\2\u0086}\3"+
		"\2\2\2\u0086\177\3\2\2\2\u0086\u0081\3\2\2\2\u0087\13\3\2\2\2\u0088\u0089"+
		"\5\6\4\2\u0089\u008a\5\26\f\2\u008a\r\3\2\2\2\u008b\u0090\5*\26\2\u008c"+
		"\u008d\7\22\2\2\u008d\u008f\5*\26\2\u008e\u008c\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\17\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0097\7\23\2\2\u0094\u0096\5\22\n\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\24\2\2\u009b\21\3\2\2"+
		"\2\u009c\u009f\5\n\6\2\u009d\u009f\5\24\13\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\5\26\f"+
		"\2\u00a2\u00a3\7\n\2\2\u00a3\25\3\2\2\2\u00a4\u00a9\5\30\r\2\u00a5\u00a6"+
		"\7\22\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00b2\5\b\5\2\u00ad\u00ae\5\b\5\2\u00ae\u00af\7\25\2\2"+
		"\u00af\u00b0\5\64\33\2\u00b0\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\33\3\2\2\2\u00b5\u00b6"+
		"\b\17\1\2\u00b6\u00b7\5\32\16\2\u00b7\u00c5\3\2\2\2\u00b8\u00b9\f\4\2"+
		"\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5,\27\2\u00bb\u00bc\7\7\2\2\u00bc\u00c4"+
		"\3\2\2\2\u00bd\u00be\f\3\2\2\u00be\u00c0\7\b\2\2\u00bf\u00c1\5,\27\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\7\t"+
		"\2\2\u00c3\u00b8\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00c9\b\20\1\2\u00c9\u00cc\5 \21\2\u00ca\u00cc\7(\2\2\u00cb\u00c8"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f\4\2\2\u00ce"+
		"\u00cf\t\4\2\2\u00cf\u00d4\5\36\20\5\u00d0\u00d1\f\3\2\2\u00d1\u00d2\t"+
		"\5\2\2\u00d2\u00d4\5\36\20\4\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\37\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00de\5\34\17\2\u00d9\u00da\7\31\2\2\u00da"+
		"\u00de\5\34\17\2\u00db\u00dc\7\32\2\2\u00dc\u00de\5\34\17\2\u00dd\u00d8"+
		"\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de!\3\2\2\2\u00df"+
		"\u00e5\5\36\20\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2\t\6\2\2\u00e2\u00e3"+
		"\5\36\20\2\u00e3\u00e5\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2"+
		"\u00e5#\3\2\2\2\u00e6\u00e7\b\23\1\2\u00e7\u00e8\5\"\22\2\u00e8\u00f1"+
		"\3\2\2\2\u00e9\u00ea\f\4\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00f0\5\"\22\2"+
		"\u00ec\u00ed\f\3\2\2\u00ed\u00ee\7 \2\2\u00ee\u00f0\5\"\22\2\u00ef\u00e9"+
		"\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\24\1\2"+
		"\u00f5\u00f6\5$\23\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\f\3\2\2\u00f8\u00f9"+
		"\7!\2\2\u00f9\u00fb\5$\23\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00ff\u0100\b\25\1\2\u0100\u0101\5$\23\2\u0101\u0107\3\2\2\2\u0102\u0103"+
		"\f\3\2\2\u0103\u0104\7\"\2\2\u0104\u0106\5$\23\2\u0105\u0102\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108)\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u010a\u0111\5&\24\2\u010b\u0111\5(\25\2\u010c\u010d"+
		"\5 \21\2\u010d\u010e\7\25\2\2\u010e\u010f\5*\26\2\u010f\u0111\3\2\2\2"+
		"\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0111+\3"+
		"\2\2\2\u0112\u0117\5*\26\2\u0113\u0114\7\22\2\2\u0114\u0116\5*\26\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118-\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011d\5\60\31\2\u011b\u011c"+
		"\7\22\2\2\u011c\u011e\7#\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"/\3\2\2\2\u011f\u0124\5\62\32\2\u0120\u0121\7\22\2\2\u0121\u0123\5\62"+
		"\32\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\61\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\5\6\4"+
		"\2\u0128\u0129\5\b\5\2\u0129\63\3\2\2\2\u012a\u0134\5*\26\2\u012b\u012d"+
		"\7\23\2\2\u012c\u012e\5\66\34\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u0130\3\2\2\2\u012f\u0131\7\22\2\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\7\24\2\2\u0133\u012a\3"+
		"\2\2\2\u0133\u012b\3\2\2\2\u0134\65\3\2\2\2\u0135\u013a\5\64\33\2\u0136"+
		"\u0137\7\22\2\2\u0137\u0139\5\64\33\2\u0138\u0136\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\67\3\2\2\2\u013c"+
		"\u013a\3\2\2\2(:<FJPVYfquy\u0083\u0086\u0090\u0097\u009e\u00a9\u00b1\u00c0"+
		"\u00c3\u00c5\u00cb\u00d3\u00d5\u00dd\u00e4\u00ef\u00f1\u00fc\u0107\u0110"+
		"\u0117\u011d\u0124\u012d\u0130\u0133\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}