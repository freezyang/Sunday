package com.sunday.member.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by novot on 2017-05-16.
 */
public class Student extends BaseMemberInfo{
    private Grade grade;
    private long classSerial;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
