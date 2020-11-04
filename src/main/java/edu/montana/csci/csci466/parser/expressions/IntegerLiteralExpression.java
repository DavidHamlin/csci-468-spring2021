package edu.montana.csci.csci466.parser.expressions;

import edu.montana.csci.csci466.parser.ParseTreeVisitor;
import edu.montana.csci.csci466.tokenizer.Token;

public class IntegerLiteralExpression extends Expression {
    private final int integerVal;

    public IntegerLiteralExpression(String value) {
        this.integerVal = Integer.parseInt(value);
    }

    @Override
    public Object evaluate() {
        return integerVal;
    }

    @Override
    public void accept(ParseTreeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return integerVal + "";
    }
}