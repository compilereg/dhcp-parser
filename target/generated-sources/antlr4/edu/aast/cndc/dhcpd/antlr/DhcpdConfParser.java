// Generated from DhcpdConf.g4 by ANTLR 4.13.1

package edu.aast.cndc.dhcpd.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DhcpdConfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, SUBNET=2, POOL=3, HOST=4, GROUP=5, SHARED_NETWORK=6, CLASS=7, 
		SUBCLASS=8, ZONE=9, KEY=10, LBRACE=11, RBRACE=12, SEMI=13, COMMA=14, COLON=15, 
		SLASH=16, OP=17, DASH_LINE=18, STRING=19, IPV4=20, NUMBER=21, IDENT=22, 
		MAC=23, LINE_COMMENT=24, BLOCK_COMMENT=25, WS=26;
	public static final int
		RULE_config = 0, RULE_element = 1, RULE_statement = 2, RULE_emptyStmt = 3, 
		RULE_includeStmt = 4, RULE_simpleStmt = 5, RULE_stmtHead = 6, RULE_stmtBody = 7, 
		RULE_stmtItem = 8, RULE_block = 9, RULE_blockHead = 10, RULE_blockParams = 11, 
		RULE_identifier = 12, RULE_stringLiteral = 13, RULE_ipAddress = 14, RULE_number = 15, 
		RULE_rangeLiteral = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "element", "statement", "emptyStmt", "includeStmt", "simpleStmt", 
			"stmtHead", "stmtBody", "stmtItem", "block", "blockHead", "blockParams", 
			"identifier", "stringLiteral", "ipAddress", "number", "rangeLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "'subnet'", "'pool'", "'host'", "'group'", "'shared-network'", 
			"'class'", "'subclass'", "'zone'", "'key'", "'{'", "'}'", "';'", "','", 
			"':'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "SUBNET", "POOL", "HOST", "GROUP", "SHARED_NETWORK", 
			"CLASS", "SUBCLASS", "ZONE", "KEY", "LBRACE", "RBRACE", "SEMI", "COMMA", 
			"COLON", "SLASH", "OP", "DASH_LINE", "STRING", "IPV4", "NUMBER", "IDENT", 
			"MAC", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "DhcpdConf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DhcpdConfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DhcpdConfParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4204542L) != 0)) {
				{
				{
				setState(34);
				element();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IncludeStmtContext includeStmt() {
			return getRuleContext(IncludeStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				includeStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				emptyStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(DhcpdConfParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStmtContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(DhcpdConfParser.INCLUDE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(DhcpdConfParser.SEMI, 0); }
		public IncludeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitIncludeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStmtContext includeStmt() throws RecognitionException {
		IncludeStmtContext _localctx = new IncludeStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_includeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(INCLUDE);
			setState(54);
			stringLiteral();
			setState(55);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public StmtHeadContext stmtHead() {
			return getRuleContext(StmtHeadContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(DhcpdConfParser.SEMI, 0); }
		public StmtBodyContext stmtBody() {
			return getRuleContext(StmtBodyContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			stmtHead();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16500734L) != 0)) {
				{
				setState(58);
				stmtBody();
				}
			}

			setState(61);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtHeadContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StmtHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitStmtHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtHeadContext stmtHead() throws RecognitionException {
		StmtHeadContext _localctx = new StmtHeadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmtHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtBodyContext extends ParserRuleContext {
		public List<StmtItemContext> stmtItem() {
			return getRuleContexts(StmtItemContext.class);
		}
		public StmtItemContext stmtItem(int i) {
			return getRuleContext(StmtItemContext.class,i);
		}
		public StmtBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitStmtBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBodyContext stmtBody() throws RecognitionException {
		StmtBodyContext _localctx = new StmtBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmtBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				stmtItem();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16500734L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IpAddressContext ipAddress() {
			return getRuleContext(IpAddressContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public TerminalNode MAC() { return getToken(DhcpdConfParser.MAC, 0); }
		public TerminalNode OP() { return getToken(DhcpdConfParser.OP, 0); }
		public TerminalNode COMMA() { return getToken(DhcpdConfParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(DhcpdConfParser.COLON, 0); }
		public TerminalNode SLASH() { return getToken(DhcpdConfParser.SLASH, 0); }
		public StmtItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitStmtItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtItemContext stmtItem() throws RecognitionException {
		StmtItemContext _localctx = new StmtItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtItem);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				ipAddress();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				stringLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				rangeLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(MAC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				match(OP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				match(COMMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				match(COLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				match(SLASH);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockHeadContext blockHead() {
			return getRuleContext(BlockHeadContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(DhcpdConfParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DhcpdConfParser.RBRACE, 0); }
		public BlockParamsContext blockParams() {
			return getRuleContext(BlockParamsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			blockHead();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16500734L) != 0)) {
				{
				setState(83);
				blockParams();
				}
			}

			setState(86);
			match(LBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4204542L) != 0)) {
				{
				{
				setState(87);
				element();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockHeadContext extends ParserRuleContext {
		public TerminalNode SUBNET() { return getToken(DhcpdConfParser.SUBNET, 0); }
		public TerminalNode POOL() { return getToken(DhcpdConfParser.POOL, 0); }
		public TerminalNode HOST() { return getToken(DhcpdConfParser.HOST, 0); }
		public TerminalNode GROUP() { return getToken(DhcpdConfParser.GROUP, 0); }
		public TerminalNode SHARED_NETWORK() { return getToken(DhcpdConfParser.SHARED_NETWORK, 0); }
		public TerminalNode CLASS() { return getToken(DhcpdConfParser.CLASS, 0); }
		public TerminalNode SUBCLASS() { return getToken(DhcpdConfParser.SUBCLASS, 0); }
		public TerminalNode ZONE() { return getToken(DhcpdConfParser.ZONE, 0); }
		public TerminalNode KEY() { return getToken(DhcpdConfParser.KEY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitBlockHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockHeadContext blockHead() throws RecognitionException {
		BlockHeadContext _localctx = new BlockHeadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockHead);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(SUBNET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(POOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(HOST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(GROUP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(SHARED_NETWORK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				match(SUBCLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				match(ZONE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(KEY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockParamsContext extends ParserRuleContext {
		public List<StmtItemContext> stmtItem() {
			return getRuleContexts(StmtItemContext.class);
		}
		public StmtItemContext stmtItem(int i) {
			return getRuleContext(StmtItemContext.class,i);
		}
		public BlockParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitBlockParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockParamsContext blockParams() throws RecognitionException {
		BlockParamsContext _localctx = new BlockParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				stmtItem();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16500734L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(DhcpdConfParser.IDENT, 0); }
		public TerminalNode INCLUDE() { return getToken(DhcpdConfParser.INCLUDE, 0); }
		public TerminalNode SUBNET() { return getToken(DhcpdConfParser.SUBNET, 0); }
		public TerminalNode POOL() { return getToken(DhcpdConfParser.POOL, 0); }
		public TerminalNode HOST() { return getToken(DhcpdConfParser.HOST, 0); }
		public TerminalNode GROUP() { return getToken(DhcpdConfParser.GROUP, 0); }
		public TerminalNode SHARED_NETWORK() { return getToken(DhcpdConfParser.SHARED_NETWORK, 0); }
		public TerminalNode CLASS() { return getToken(DhcpdConfParser.CLASS, 0); }
		public TerminalNode SUBCLASS() { return getToken(DhcpdConfParser.SUBCLASS, 0); }
		public TerminalNode ZONE() { return getToken(DhcpdConfParser.ZONE, 0); }
		public TerminalNode KEY() { return getToken(DhcpdConfParser.KEY, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4196350L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DhcpdConfParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IpAddressContext extends ParserRuleContext {
		public TerminalNode IPV4() { return getToken(DhcpdConfParser.IPV4, 0); }
		public IpAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipAddress; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitIpAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpAddressContext ipAddress() throws RecognitionException {
		IpAddressContext _localctx = new IpAddressContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ipAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IPV4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DhcpdConfParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeLiteralContext extends ParserRuleContext {
		public List<TerminalNode> IPV4() { return getTokens(DhcpdConfParser.IPV4); }
		public TerminalNode IPV4(int i) {
			return getToken(DhcpdConfParser.IPV4, i);
		}
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhcpdConfVisitor ) return ((DhcpdConfVisitor<? extends T>)visitor).visitRangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rangeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IPV4);
			setState(121);
			match(IPV4);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005<\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007C\b\u0007\u000b\u0007\f\u0007"+
		"D\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bQ\b\b\u0001\t\u0001\t\u0003\tU\b\t\u0001\t\u0001\t\u0005"+
		"\tY\b\t\n\t\f\t\\\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nj\b\n\u0001\u000b"+
		"\u0004\u000bm\b\u000b\u000b\u000b\f\u000bn\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0001"+
		"\u0002\u0000\u0001\n\u0016\u0016\u0085\u0000%\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00063"+
		"\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000"+
		"\u0000\f?\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014i\u0001"+
		"\u0000\u0000\u0000\u0016l\u0001\u0000\u0000\u0000\u0018p\u0001\u0000\u0000"+
		"\u0000\u001ar\u0001\u0000\u0000\u0000\u001ct\u0001\u0000\u0000\u0000\u001e"+
		"v\u0001\u0000\u0000\u0000 x\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000()\u0005\u0000\u0000\u0001)\u0001\u0001\u0000\u0000"+
		"\u0000*-\u0003\u0004\u0002\u0000+-\u0003\u0012\t\u0000,*\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000.2\u0003"+
		"\b\u0004\u0000/2\u0003\n\u0005\u000002\u0003\u0006\u0003\u00001.\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"2\u0005\u0001\u0000\u0000\u000034\u0005\r\u0000\u00004\u0007\u0001\u0000"+
		"\u0000\u000056\u0005\u0001\u0000\u000067\u0003\u001a\r\u000078\u0005\r"+
		"\u0000\u00008\t\u0001\u0000\u0000\u00009;\u0003\f\u0006\u0000:<\u0003"+
		"\u000e\u0007\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0005\r\u0000\u0000>\u000b\u0001\u0000\u0000"+
		"\u0000?@\u0003\u0018\f\u0000@\r\u0001\u0000\u0000\u0000AC\u0003\u0010"+
		"\b\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\u000f\u0001\u0000\u0000\u0000"+
		"FQ\u0003\u0018\f\u0000GQ\u0003\u001c\u000e\u0000HQ\u0003\u001e\u000f\u0000"+
		"IQ\u0003\u001a\r\u0000JQ\u0003 \u0010\u0000KQ\u0005\u0017\u0000\u0000"+
		"LQ\u0005\u0011\u0000\u0000MQ\u0005\u000e\u0000\u0000NQ\u0005\u000f\u0000"+
		"\u0000OQ\u0005\u0010\u0000\u0000PF\u0001\u0000\u0000\u0000PG\u0001\u0000"+
		"\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PJ\u0001"+
		"\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000"+
		"PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000"+
		"\u0000Q\u0011\u0001\u0000\u0000\u0000RT\u0003\u0014\n\u0000SU\u0003\u0016"+
		"\u000b\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VZ\u0005\u000b\u0000\u0000WY\u0003\u0002\u0001\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\f\u0000\u0000^\u0013\u0001\u0000\u0000\u0000_j\u0005"+
		"\u0002\u0000\u0000`j\u0005\u0003\u0000\u0000aj\u0005\u0004\u0000\u0000"+
		"bj\u0005\u0005\u0000\u0000cj\u0005\u0006\u0000\u0000dj\u0005\u0007\u0000"+
		"\u0000ej\u0005\b\u0000\u0000fj\u0005\t\u0000\u0000gj\u0005\n\u0000\u0000"+
		"hj\u0003\u0018\f\u0000i_\u0001\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000"+
		"ia\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000"+
		"\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0015"+
		"\u0001\u0000\u0000\u0000km\u0003\u0010\b\u0000lk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\u0017\u0001\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\u0019"+
		"\u0001\u0000\u0000\u0000rs\u0005\u0013\u0000\u0000s\u001b\u0001\u0000"+
		"\u0000\u0000tu\u0005\u0014\u0000\u0000u\u001d\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0015\u0000\u0000w\u001f\u0001\u0000\u0000\u0000xy\u0005\u0014"+
		"\u0000\u0000yz\u0005\u0014\u0000\u0000z!\u0001\u0000\u0000\u0000\n%,1"+
		";DPTZin";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}