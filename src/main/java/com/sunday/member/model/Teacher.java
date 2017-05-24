package com.sunday.member.model;

import com.sunday.member.type.Position;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by novot on 2017-05-16.
 */
public class Teacher extends BaseMemberInfo{
    private long teacherSerial;
    private int career;
    private Position position;

    public long getTeacherSerial() {
        return teacherSerial;
    }

    public void setTeacherSerial(long teacherSerial) {
        this.teacherSerial = teacherSerial;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
