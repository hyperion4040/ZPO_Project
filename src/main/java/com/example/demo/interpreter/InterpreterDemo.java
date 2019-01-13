package com.example.demo.interpreter;

import java.util.List;

public class InterpreterDemo {


    public static Expression isHighSchool() {
        Expression name = new TerminalExression("schoolName");
        List<Expression> expressionList = List.of(name);
        return new BelongToExpression(expressionList);
    }

    public static Expression isUniversityOfTechnology() {
        Expression name = new TerminalExression("universityName");
        List<Expression> expressionList = List.of(name);
        return new BelongToExpression(expressionList);
    }

}
