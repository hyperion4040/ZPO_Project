package com.example.demo.interpreter;

import java.util.List;

public class BelongToExpression implements Expression {

    private List<Expression> expressionList;

    public BelongToExpression(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public boolean interpret(String context) {

        return expressionList.stream().anyMatch(s ->s.interpret(context));

    }
}
