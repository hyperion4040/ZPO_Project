package com.example.demo.interpreter;

import java.util.List;

public class InterpreterDemo {


    private static List<Expression> universityExpressionList;
    private static List<Expression> highSchoolExpresssionList;

    public static List<Expression> getHighSchoolExpresssionList() {
        return highSchoolExpresssionList;
    }

    public static Expression isHighSchool() {
        Expression name = new TerminalExression("schoolName");
        Expression students = new TerminalExression("students");
        highSchoolExpresssionList = List.of(name);
        return new BelongToExpression(highSchoolExpresssionList);
    }

    public static List<Expression> getUniversityExpressionList() {
        return universityExpressionList;
    }

    public static Expression isUniversityOfTechnology() {
        Expression name = new TerminalExression("universityName");
        Expression foundingYear = new TerminalExression("foundingYear");
        Expression students = new TerminalExression("universityStudents");
        universityExpressionList = List.of(name, foundingYear, students);
        return new BelongToExpression(universityExpressionList);
    }


}
