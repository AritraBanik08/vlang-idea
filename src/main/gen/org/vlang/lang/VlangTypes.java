// This is a generated file. Not intended for manual editing.
package org.vlang.lang;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.vlang.lang.psi.VlangCompositeElementType;
import org.vlang.lang.psi.VlangTokenType;
import org.vlang.lang.psi.impl.*;
import org.vlang.lang.stubs.VlangElementTypeFactory;

public interface VlangTypes {

  IElementType ADD_EXPR = new VlangCompositeElementType("ADD_EXPR");
  IElementType AND_EXPR = new VlangCompositeElementType("AND_EXPR");
  IElementType ARGUMENT_LIST = new VlangCompositeElementType("ARGUMENT_LIST");
  IElementType ARRAY_OR_SLICE_TYPE = new VlangCompositeElementType("ARRAY_OR_SLICE_TYPE");
  IElementType ASSIGNMENT_STATEMENT = new VlangCompositeElementType("ASSIGNMENT_STATEMENT");
  IElementType ASSIGN_OP = new VlangCompositeElementType("ASSIGN_OP");
  IElementType ATTRIBUTE = new VlangCompositeElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new VlangCompositeElementType("ATTRIBUTES");
  IElementType ATTRIBUTE_EXPRESSION = new VlangCompositeElementType("ATTRIBUTE_EXPRESSION");
  IElementType BLOCK = new VlangCompositeElementType("BLOCK");
  IElementType BREAK_STATEMENT = new VlangCompositeElementType("BREAK_STATEMENT");
  IElementType CALL_EXPR = new VlangCompositeElementType("CALL_EXPR");
  IElementType COMPILE_ELSE_STATEMENT = new VlangCompositeElementType("COMPILE_ELSE_STATEMENT");
  IElementType COMPILE_TIME_IF_STATEMENT = new VlangCompositeElementType("COMPILE_TIME_IF_STATEMENT");
  IElementType CONDITIONAL_EXPR = new VlangCompositeElementType("CONDITIONAL_EXPR");
  IElementType CONTINUE_STATEMENT = new VlangCompositeElementType("CONTINUE_STATEMENT");
  IElementType DEFER_STATEMENT = new VlangCompositeElementType("DEFER_STATEMENT");
  IElementType ELSE_STATEMENT = new VlangCompositeElementType("ELSE_STATEMENT");
  IElementType ERROR_PROPAGATION = new VlangCompositeElementType("ERROR_PROPAGATION");
  IElementType EXPRESSION = new VlangCompositeElementType("EXPRESSION");
  IElementType FOR_CLAUSE = new VlangCompositeElementType("FOR_CLAUSE");
  IElementType FOR_STATEMENT = new VlangCompositeElementType("FOR_STATEMENT");
  IElementType FUNCTION_DECLARATION = VlangElementTypeFactory.stubFactory("FUNCTION_DECLARATION");
  IElementType GO_STATEMENT = new VlangCompositeElementType("GO_STATEMENT");
  IElementType IF_ATTRIBUTE = new VlangCompositeElementType("IF_ATTRIBUTE");
  IElementType IF_STATEMENT = new VlangCompositeElementType("IF_STATEMENT");
  IElementType IMPORT_ALIAS = new VlangCompositeElementType("IMPORT_ALIAS");
  IElementType IMPORT_DECLARATION = new VlangCompositeElementType("IMPORT_DECLARATION");
  IElementType IMPORT_LIST = new VlangCompositeElementType("IMPORT_LIST");
  IElementType IMPORT_SPEC = new VlangCompositeElementType("IMPORT_SPEC");
  IElementType INC_DEC_STATEMENT = new VlangCompositeElementType("INC_DEC_STATEMENT");
  IElementType INDEX_OR_SLICE_EXPR = new VlangCompositeElementType("INDEX_OR_SLICE_EXPR");
  IElementType LABEL_REF = new VlangCompositeElementType("LABEL_REF");
  IElementType LEFT_HAND_EXPR_LIST = new VlangCompositeElementType("LEFT_HAND_EXPR_LIST");
  IElementType LITERAL = new VlangCompositeElementType("LITERAL");
  IElementType METHOD_DECLARATION = VlangElementTypeFactory.stubFactory("METHOD_DECLARATION");
  IElementType MODULE_CLAUSE = VlangElementTypeFactory.stubFactory("MODULE_CLAUSE");
  IElementType MUL_EXPR = new VlangCompositeElementType("MUL_EXPR");
  IElementType OR_EXPR = new VlangCompositeElementType("OR_EXPR");
  IElementType PARAMETERS = new VlangCompositeElementType("PARAMETERS");
  IElementType PARAMETER_DECLARATION = new VlangCompositeElementType("PARAMETER_DECLARATION");
  IElementType PARAM_DEFINITION = new VlangCompositeElementType("PARAM_DEFINITION");
  IElementType PARENTHESES_EXPR = new VlangCompositeElementType("PARENTHESES_EXPR");
  IElementType PAR_TYPE = new VlangCompositeElementType("PAR_TYPE");
  IElementType PLAIN_ATTRIBUTE = new VlangCompositeElementType("PLAIN_ATTRIBUTE");
  IElementType POINTER_TYPE = new VlangCompositeElementType("POINTER_TYPE");
  IElementType RANGE_CLAUSE = new VlangCompositeElementType("RANGE_CLAUSE");
  IElementType RECEIVER = new VlangCompositeElementType("RECEIVER");
  IElementType REFERENCE_EXPRESSION = new VlangCompositeElementType("REFERENCE_EXPRESSION");
  IElementType RESULT = new VlangCompositeElementType("RESULT");
  IElementType RETURN_STATEMENT = new VlangCompositeElementType("RETURN_STATEMENT");
  IElementType SELECTIVE_IMPORT_LIST = new VlangCompositeElementType("SELECTIVE_IMPORT_LIST");
  IElementType SHORT_VAR_DECLARATION = new VlangCompositeElementType("SHORT_VAR_DECLARATION");
  IElementType SIGNATURE = new VlangCompositeElementType("SIGNATURE");
  IElementType SIMPLE_STATEMENT = new VlangCompositeElementType("SIMPLE_STATEMENT");
  IElementType STATEMENT = new VlangCompositeElementType("STATEMENT");
  IElementType STRING_LITERAL = new VlangCompositeElementType("STRING_LITERAL");
  IElementType SYMBOL_MUTABILITY = new VlangCompositeElementType("SYMBOL_MUTABILITY");
  IElementType SYMBOL_VISIBILITY = new VlangCompositeElementType("SYMBOL_VISIBILITY");
  IElementType TYPE = new VlangCompositeElementType("TYPE");
  IElementType TYPE_LIST = new VlangCompositeElementType("TYPE_LIST");
  IElementType TYPE_REFERENCE_EXPRESSION = new VlangCompositeElementType("TYPE_REFERENCE_EXPRESSION");
  IElementType UNARY_EXPR = new VlangCompositeElementType("UNARY_EXPR");
  IElementType UNSAGE_STATEMENT = new VlangCompositeElementType("UNSAGE_STATEMENT");
  IElementType VAR_DEFINITION = new VlangCompositeElementType("VAR_DEFINITION");

  IElementType AS = new VlangTokenType("as");
  IElementType ASSIGN = new VlangTokenType("=");
  IElementType BIT_AND = new VlangTokenType("&");
  IElementType BIT_AND_ASSIGN = new VlangTokenType("&=");
  IElementType BIT_CLEAR = new VlangTokenType("&^");
  IElementType BIT_CLEAR_ASSIGN = new VlangTokenType("&^=");
  IElementType BIT_OR = new VlangTokenType("|");
  IElementType BIT_OR_ASSIGN = new VlangTokenType("|=");
  IElementType BIT_XOR = new VlangTokenType("^");
  IElementType BIT_XOR_ASSIGN = new VlangTokenType("^=");
  IElementType BREAK = new VlangTokenType("break");
  IElementType CASE = new VlangTokenType("case");
  IElementType CHAN = new VlangTokenType("chan");
  IElementType CHAR = new VlangTokenType("char");
  IElementType COLON = new VlangTokenType(":");
  IElementType COMMA = new VlangTokenType(",");
  IElementType COND_AND = new VlangTokenType("&&");
  IElementType COND_OR = new VlangTokenType("||");
  IElementType CONST = new VlangTokenType("const");
  IElementType CONTINUE = new VlangTokenType("continue");
  IElementType DECIMALI = new VlangTokenType("decimali");
  IElementType DEFAULT = new VlangTokenType("default");
  IElementType DEFER = new VlangTokenType("defer");
  IElementType DOT = new VlangTokenType(".");
  IElementType ELSE = new VlangTokenType("else");
  IElementType ELSE_COMPILE_TIME = new VlangTokenType("ELSE_COMPILE_TIME");
  IElementType EQ = new VlangTokenType("==");
  IElementType FALLTHROUGH = new VlangTokenType("fallthrough");
  IElementType FLOAT = new VlangTokenType("float");
  IElementType FLOATI = new VlangTokenType("floati");
  IElementType FN = new VlangTokenType("fn");
  IElementType FOR = new VlangTokenType("for");
  IElementType GO = new VlangTokenType("go");
  IElementType GOTO = new VlangTokenType("goto");
  IElementType GREATER = new VlangTokenType(">");
  IElementType GREATER_OR_EQUAL = new VlangTokenType(">=");
  IElementType HEX = new VlangTokenType("hex");
  IElementType IDENTIFIER = new VlangTokenType("identifier");
  IElementType IF = new VlangTokenType("if");
  IElementType IF_COMPILE_TIME = new VlangTokenType("IF_COMPILE_TIME");
  IElementType IMPORT = new VlangTokenType("import");
  IElementType IN = new VlangTokenType("in");
  IElementType INT = new VlangTokenType("int");
  IElementType INTERFACE = new VlangTokenType("interface");
  IElementType LBRACE = new VlangTokenType("{");
  IElementType LBRACK = new VlangTokenType("[");
  IElementType LESS = new VlangTokenType("<");
  IElementType LESS_OR_EQUAL = new VlangTokenType("<=");
  IElementType LPAREN = new VlangTokenType("(");
  IElementType MAP = new VlangTokenType("map");
  IElementType MINUS = new VlangTokenType("-");
  IElementType MINUS_ASSIGN = new VlangTokenType("-=");
  IElementType MINUS_MINUS = new VlangTokenType("--");
  IElementType MODULE = new VlangTokenType("module");
  IElementType MUL = new VlangTokenType("*");
  IElementType MUL_ASSIGN = new VlangTokenType("*=");
  IElementType MUT = new VlangTokenType("mut");
  IElementType NOT = new VlangTokenType("!");
  IElementType NOT_EQ = new VlangTokenType("!=");
  IElementType OCT = new VlangTokenType("oct");
  IElementType PLUS = new VlangTokenType("+");
  IElementType PLUS_ASSIGN = new VlangTokenType("+=");
  IElementType PLUS_PLUS = new VlangTokenType("++");
  IElementType PUB = new VlangTokenType("pub");
  IElementType QUESTION = new VlangTokenType("?");
  IElementType QUOTIENT = new VlangTokenType("/");
  IElementType QUOTIENT_ASSIGN = new VlangTokenType("/=");
  IElementType RAW_STRING = new VlangTokenType("raw_string");
  IElementType RBRACE = new VlangTokenType("}");
  IElementType RBRACK = new VlangTokenType("]");
  IElementType REMAINDER = new VlangTokenType("%");
  IElementType REMAINDER_ASSIGN = new VlangTokenType("%=");
  IElementType RETURN = new VlangTokenType("return");
  IElementType RPAREN = new VlangTokenType(")");
  IElementType SELECT = new VlangTokenType("select");
  IElementType SEMICOLON = new VlangTokenType(";");
  IElementType SEMICOLON_SYNTHETIC = new VlangTokenType("<NL>");
  IElementType SEND_CHANNEL = new VlangTokenType("<-");
  IElementType SHIFT_LEFT = new VlangTokenType("<<");
  IElementType SHIFT_LEFT_ASSIGN = new VlangTokenType("<<=");
  IElementType SHIFT_RIGHT = new VlangTokenType(">>");
  IElementType SHIFT_RIGHT_ASSIGN = new VlangTokenType(">>=");
  IElementType STRING = new VlangTokenType("string");
  IElementType STRUCT = new VlangTokenType("struct");
  IElementType SWITCH = new VlangTokenType("switch");
  IElementType TRIPLE_DOT = new VlangTokenType("...");
  IElementType TYPE_ = new VlangTokenType("type");
  IElementType UNSAFE = new VlangTokenType("unsafe");
  IElementType VAR = new VlangTokenType("var");
  IElementType VAR_ASSIGN = new VlangTokenType(":=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_EXPR) {
        return new VlangAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new VlangAndExprImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new VlangArgumentListImpl(node);
      }
      else if (type == ARRAY_OR_SLICE_TYPE) {
        return new VlangArrayOrSliceTypeImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new VlangAssignmentStatementImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new VlangAssignOpImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new VlangAttributeImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new VlangAttributesImpl(node);
      }
      else if (type == ATTRIBUTE_EXPRESSION) {
        return new VlangAttributeExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new VlangBlockImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new VlangBreakStatementImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new VlangCallExprImpl(node);
      }
      else if (type == COMPILE_ELSE_STATEMENT) {
        return new VlangCompileElseStatementImpl(node);
      }
      else if (type == COMPILE_TIME_IF_STATEMENT) {
        return new VlangCompileTimeIfStatementImpl(node);
      }
      else if (type == CONDITIONAL_EXPR) {
        return new VlangConditionalExprImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new VlangContinueStatementImpl(node);
      }
      else if (type == DEFER_STATEMENT) {
        return new VlangDeferStatementImpl(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new VlangElseStatementImpl(node);
      }
      else if (type == ERROR_PROPAGATION) {
        return new VlangErrorPropagationImpl(node);
      }
      else if (type == FOR_CLAUSE) {
        return new VlangForClauseImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new VlangForStatementImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new VlangFunctionDeclarationImpl(node);
      }
      else if (type == GO_STATEMENT) {
        return new VlangGoStatementImpl(node);
      }
      else if (type == IF_ATTRIBUTE) {
        return new VlangIfAttributeImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new VlangIfStatementImpl(node);
      }
      else if (type == IMPORT_ALIAS) {
        return new VlangImportAliasImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new VlangImportDeclarationImpl(node);
      }
      else if (type == IMPORT_LIST) {
        return new VlangImportListImpl(node);
      }
      else if (type == IMPORT_SPEC) {
        return new VlangImportSpecImpl(node);
      }
      else if (type == INC_DEC_STATEMENT) {
        return new VlangIncDecStatementImpl(node);
      }
      else if (type == INDEX_OR_SLICE_EXPR) {
        return new VlangIndexOrSliceExprImpl(node);
      }
      else if (type == LABEL_REF) {
        return new VlangLabelRefImpl(node);
      }
      else if (type == LEFT_HAND_EXPR_LIST) {
        return new VlangLeftHandExprListImpl(node);
      }
      else if (type == LITERAL) {
        return new VlangLiteralImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new VlangMethodDeclarationImpl(node);
      }
      else if (type == MODULE_CLAUSE) {
        return new VlangModuleClauseImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new VlangMulExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new VlangOrExprImpl(node);
      }
      else if (type == PARAMETERS) {
        return new VlangParametersImpl(node);
      }
      else if (type == PARAMETER_DECLARATION) {
        return new VlangParameterDeclarationImpl(node);
      }
      else if (type == PARAM_DEFINITION) {
        return new VlangParamDefinitionImpl(node);
      }
      else if (type == PARENTHESES_EXPR) {
        return new VlangParenthesesExprImpl(node);
      }
      else if (type == PAR_TYPE) {
        return new VlangParTypeImpl(node);
      }
      else if (type == PLAIN_ATTRIBUTE) {
        return new VlangPlainAttributeImpl(node);
      }
      else if (type == POINTER_TYPE) {
        return new VlangPointerTypeImpl(node);
      }
      else if (type == RANGE_CLAUSE) {
        return new VlangRangeClauseImpl(node);
      }
      else if (type == RECEIVER) {
        return new VlangReceiverImpl(node);
      }
      else if (type == REFERENCE_EXPRESSION) {
        return new VlangReferenceExpressionImpl(node);
      }
      else if (type == RESULT) {
        return new VlangResultImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new VlangReturnStatementImpl(node);
      }
      else if (type == SELECTIVE_IMPORT_LIST) {
        return new VlangSelectiveImportListImpl(node);
      }
      else if (type == SHORT_VAR_DECLARATION) {
        return new VlangShortVarDeclarationImpl(node);
      }
      else if (type == SIGNATURE) {
        return new VlangSignatureImpl(node);
      }
      else if (type == SIMPLE_STATEMENT) {
        return new VlangSimpleStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new VlangStatementImpl(node);
      }
      else if (type == STRING_LITERAL) {
        return new VlangStringLiteralImpl(node);
      }
      else if (type == SYMBOL_MUTABILITY) {
        return new VlangSymbolMutabilityImpl(node);
      }
      else if (type == SYMBOL_VISIBILITY) {
        return new VlangSymbolVisibilityImpl(node);
      }
      else if (type == TYPE) {
        return new VlangTypeImpl(node);
      }
      else if (type == TYPE_LIST) {
        return new VlangTypeListImpl(node);
      }
      else if (type == TYPE_REFERENCE_EXPRESSION) {
        return new VlangTypeReferenceExpressionImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new VlangUnaryExprImpl(node);
      }
      else if (type == UNSAGE_STATEMENT) {
        return new VlangUnsageStatementImpl(node);
      }
      else if (type == VAR_DEFINITION) {
        return new VlangVarDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
