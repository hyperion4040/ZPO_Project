package com.example.demo.interpreter;

public class TerminalExression implements Expression {

    private String data;

    public TerminalExression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
