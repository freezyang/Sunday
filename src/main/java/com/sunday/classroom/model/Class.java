package com.sunday.classroom.model;

import com.sunday.member.model.Teacher;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by novot on 2017-05-16.
 */
public class Class {
    private long classSerial;
    private String name;  //반이름
    private String classRoom;  //교실위치
    private Teacher seniorClassTeacher;  //정 담임교사
    private Teacher juniorClassTeacher;  //부 담임교사
    private int studentCount;  //학생수

    public long getClassSerial() {
        return classSerial;
    }

    public void setClassSerial(long classSerial) {
        this.classSerial = classSerial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Teacher getSeniorClassTeacher() {
        return seniorClassTeacher;
    }

    public void setSeniorClassTeacher(Teacher seniorClassTeacher) {
        this.seniorClassTeacher = seniorClassTeacher;
    }

    public Teacher getJuniorClassTeacher() {
        return juniorClassTeacher;
    }

    public void setJuniorClassTeacher(Teacher juniorClassTeacher) {
        this.juniorClassTeacher = juniorClassTeacher;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
