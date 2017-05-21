package com.sunday.member.model;

/**
 * Created by novot on 2017-05-16.
 */
public enum Position {

    VICE_PRINCIPAL("P1", "교감"),
    REGULAR_TEACHER("P2", "평교사");

    private final String code;
    private final String name;
    Position(String positionCode, String name) {
        this.code = positionCode;
        this.name = code;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
