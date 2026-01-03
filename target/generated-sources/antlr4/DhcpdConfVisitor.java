// Generated from DhcpdConf.g4 by ANTLR 4.13.1

package edu.aast.cndc.dhcpd.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DhcpdConfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DhcpdConfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(DhcpdConfParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DhcpdConfParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DhcpdConfParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#includeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStmt(DhcpdConfParser.IncludeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(DhcpdConfParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#stmtHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHead(DhcpdConfParser.StmtHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#stmtBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBody(DhcpdConfParser.StmtBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#stmtItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtItem(DhcpdConfParser.StmtItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DhcpdConfParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#blockHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockHead(DhcpdConfParser.BlockHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#blockParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParams(DhcpdConfParser.BlockParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DhcpdConfParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DhcpdConfParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(DhcpdConfParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#rangeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeLiteral(DhcpdConfParser.RangeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DhcpdConfParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DhcpdConfParser.NumberContext ctx);
}