package com.sunday.member.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by novot on 2017-05-16.
 */
public abstract class BaseMemberInfo {
    protected long serialNo;
    protected String name;
    protected String christianName;
    protected int age;
    protected String festivitas;
    protected LocalDate birthday;
    protected String address;
    protected String zipcode;
    protected String cellNumber;
    protected LocalDateTime createDt;
    protected String createWho;
    protected LocalDateTime updateDt;
    protected String updateWho;

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

    public String getFestivitas() {
        return festivitas;
    }

    public void setFestivitas(String festivitas) {
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
        return ToStringBuilder.reflectionToString(this);
    }
}
