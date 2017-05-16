package com.sunday.member.model;

/**
 * Created by novot on 2017-05-16.
 */
public class Class {
    private String name;
    private String classRoom;
    private int people;

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

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", people=" + people +
                '}';
    }
}
