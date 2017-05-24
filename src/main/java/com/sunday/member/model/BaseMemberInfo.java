package com.sunday.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sunday.member.type.Gender;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by novot on 2017-05-16.
 */
public abstract class BaseMemberInfo {
    protected String name;
    protected String christianName;
    protected int age;
    protected Gender gender;
    protected String festivitas;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected LocalDate birthday;
    protected String address;
    protected String zipcode;
    protected String cellPhone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime createDt;
    protected String createWho;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime updateDt;
    protected String updateWho;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public String getCreateWho() {
        return createWho;
    }

    public void setCreateWho(String createWho) {
        this.createWho = createWho;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    public String getUpdateWho() {
        return updateWho;
    }

    public void setUpdateWho(String updateWho) {
        this.updateWho = updateWho;
    }
}
