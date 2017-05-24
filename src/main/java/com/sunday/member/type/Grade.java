package com.sunday.member.type;

/**
 * Created by novot on 2017-05-16.
 */
public enum Grade {

    GK5("유치 5세"),
    GK6("유치 6세"),
    GK7("유치 7세"),
    GE1("초등 1학년"),
    GE2("초등 2학년"),
    GE3("초등 3학년"),
    GE4("초등 4학년"),
    GE5("초등 5학년"),
    GE6("초등 6학년");

    private String description;

    Grade(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
