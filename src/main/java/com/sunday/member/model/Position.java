package com.sunday.member.model;

/**
 * Created by novot on 2017-05-16.
 */
public enum Position {

    VICE_PRINCIPAL("P1", "교감"),
    REGULAR_TEACHER("P2", "평교사");

    private final String positionCode;
    private final String positionName;
    Position(String positionCode, String positionName) {
        this.positionCode = positionCode;
        this.positionName = positionName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public String getPositionName() {
        return positionName;
    }
}
