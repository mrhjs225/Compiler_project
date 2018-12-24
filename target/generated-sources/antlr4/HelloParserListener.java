// Generated from HelloParser.g4 by ANTLR 4.7.2
import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 * @throws IOException 
	 */
	void enterProg(HelloParser.ProgContext ctx) throws IOException;
	/**
	 * Exit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HelloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(HelloParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(HelloParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 * @throws IOException 
	 */
	void enterDecl(HelloParser.DeclContext ctx) throws IOException;
	/**
	 * Exit a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HelloParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#words}.
	 * @param ctx the parse tree
	 */
	void enterWords(HelloParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(HelloParser.WordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#vtype}.
	 * @param ctx the parse tree
	 */
	void enterVtype(HelloParser.VtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#vtype}.
	 * @param ctx the parse tree
	 */
	void exitVtype(HelloParser.VtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#slist}.
	 * @param ctx the parse tree
	 */
	void enterSlist(HelloParser.SlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#slist}.
	 * @param ctx the parse tree
	 */
	void exitSlist(HelloParser.SlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(HelloParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(HelloParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statb}.
	 * @param ctx the parse tree
	 */
	void enterStatb(HelloParser.StatbContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statb}.
	 * @param ctx the parse tree
	 */
	void exitStatb(HelloParser.StatbContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(HelloParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(HelloParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(HelloParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(HelloParser.FactContext ctx);
}