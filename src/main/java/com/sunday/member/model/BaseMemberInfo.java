package com.sunday.member.model;

import java.time.LocalDate;

/**
 * Created by novot on 2017-05-16.
 */
public class BaseMemberInfo {
    protected long serialNo;
    protected String name;
    protected String christianName;
    protected int age;
    protected LocalDate festivitas;
    protected LocalDate birthday;
    protected String address;
    protected String zipcode;
    protected String cellNumber;

    public long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChristianName() {
        return christianName;
    }

    public void setChristianName(String christianName) {
        this.christianName = christianName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getFestivitas() {
        return festivitas;
    }

    public void setFestivitas(LocalDate festivitas) {
        this.festivitas = festivitas;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @Override
    public String toString() {
        return "BaseMemberInfo{" +
                "serialNo=" + serialNo +
                ", name='" + name + '\'' +
                ", christianName='" + christianName + '\'' +
                ", age=" + age +
                ", festivitas=" + festivitas +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                '}';
    }
}
