package com.sunday.member.model;

import java.time.LocalDate;

/**
 * Created by novot on 2017-05-16.
 */
public class Teacher extends BaseMemberInfo{
    private int career;
    private Position position;

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
        return "Teacher{" +
                "career=" + career +
                ", position=" + position +
                '}';
    }
}
