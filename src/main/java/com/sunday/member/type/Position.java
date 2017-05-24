package com.sunday.member.type;

/**
 * Created by novot on 2017-05-16.
 */
public enum Position {
    P1("교감"),
    P2("교무"),
    P3("서기"),
    P4("평교사");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
