package com.craftinginterpreters.lox;

/**
 * Created by sney2002 on 2/01/20.
 */
public enum TokenType {
    // Single character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR, PERCENT,

    // One or two character tokens
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Keywords
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE,
    BREAK, CONTINUE,

    QUESTION_MARK, COLON,

    EOF
}
