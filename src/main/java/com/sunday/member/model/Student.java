package com.sunday.member.model;

/**
 * Created by novot on 2017-05-16.
 */
public class Student extends BaseMemberInfo{
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
