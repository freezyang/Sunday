package com.sunday.member.model;

/**
 * Created by novot on 2017-05-16.
 */
public enum Grade {

    KINDER_NO5("GK5", "유치 5세"),
    KINDER_NO6("GK6", "유치 6세"),
    KINDER_NO7("GK7", "유치 7세"),
    ELEMENTARY_NO1("GE1", "초등 1학년"),
    ELEMENTARY_NO2("GE2", "초등 2학년"),
    ELEMENTARY_NO3("GE3", "초등 3학년"),
    ELEMENTARY_NO4("GE4", "초등 4학년"),
    ELEMENTARY_NO5("GE5", "초등 5학년"),
    ELEMENTARY_NO6("GE6", "초등 6학년");

    private String gradeCode;
    private String gradeName;

    Grade(String gradeCode, String gradeName) {
        this.gradeCode = gradeCode;
        this.gradeName = gradeName;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public String getGradeName() {
        return gradeName;
    }
}
