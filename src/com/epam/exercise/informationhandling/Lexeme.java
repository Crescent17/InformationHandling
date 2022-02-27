package com.epam.exercise.informationhandling;

public class Lexeme {
    LexemeType type;
    String value;

    public Lexeme(LexemeType type, String value) {
        this.type = type;
        this.value = value;
    }

    public Lexeme(LexemeType type, Character value) {
        this.type = type;
        this.value = value.toString();
    }

    @Override
    public String toString() {
        return "epam.exercise.informationhandling.Lexeme{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}