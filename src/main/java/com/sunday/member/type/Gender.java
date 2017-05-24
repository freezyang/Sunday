package com.sunday.member.type;

/**
 * Created by novot on 2017-05-23.
 */
public enum Gender {
    M("남자"),
    F("여자");

    private String description;
    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
