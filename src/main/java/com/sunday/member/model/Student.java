package com.sunday.member.model;

import com.sunday.member.type.Grade;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by novot on 2017-05-16.
 */
public class Student extends BaseMemberInfo{
    private long studuentSerial;
    private Grade grade;
    private long classSerial;

    public long getStuduentSerial() {
        return studuentSerial;
    }

    public void setStuduentSerial(long studuentSerial) {
        this.studuentSerial = studuentSerial;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public long getClassSerial() {
        return classSerial;
    }

    public void setClassSerial(long classSerial) {
        this.classSerial = classSerial;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
