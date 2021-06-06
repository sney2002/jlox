package com.craftinginterpreters.lox;

import java.util.List;

public class LoxFunction implements LoxCallable {
    private final Stmt.Function declaration;
    private final Environment closure;

    LoxFunction(Stmt.Function declaration, Environment closure) {
        this.declaration = declaration;
        this.closure = closure;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        Environment environment = new Environment(closure);
        for (int i = 0; i < declaration.params.size(); i++) {
            environment.define(declaration.params.get(i).lexeme, arguments.get(i));
        }

        interpreter.executeBlock(declaration.body, environment);
        Object value = interpreter.returnValue;

        interpreter.returnValue = null;
        interpreter.hasReturn = false;

        return value;
    }

    @Override
    public int arity() {
        return declaration.params.size();
    }

    @Override
    public String toString() {

        if (declaration.name != null) {
            return "<fn " + declaration.name.lexeme + ">";
        }

        return "<Anonymous Function>";
    }
}
