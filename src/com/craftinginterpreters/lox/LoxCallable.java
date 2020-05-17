package com.craftinginterpreters.lox;

import java.util.List;

interface LoxCallable {
    public int arity();

    public Object call(Interpreter interpreter, List<Object> params);
}
