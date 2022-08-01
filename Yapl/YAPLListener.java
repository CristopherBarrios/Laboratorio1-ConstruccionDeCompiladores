// Generated from YAPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YAPLParser}.
 */
public interface YAPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YAPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YAPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YAPLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YAPLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(YAPLParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(YAPLParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(YAPLParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(YAPLParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(YAPLParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(YAPLParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(YAPLParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(YAPLParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(YAPLParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(YAPLParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(YAPLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(YAPLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(YAPLParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(YAPLParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YAPLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YAPLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YAPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YAPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(YAPLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(YAPLParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YAPLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YAPLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(YAPLParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(YAPLParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(YAPLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(YAPLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(YAPLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(YAPLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(YAPLParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(YAPLParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(YAPLParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(YAPLParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(YAPLParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(YAPLParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(YAPLParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(YAPLParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(YAPLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(YAPLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(YAPLParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(YAPLParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(YAPLParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(YAPLParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAPLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(YAPLParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAPLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(YAPLParser.Bool_literalContext ctx);
}