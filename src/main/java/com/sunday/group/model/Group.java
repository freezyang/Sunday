package com.sunday.group.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;

/**
 * Created by novot on 2017-05-30.
 */
public class Group {
    private long groupSerial;
    private long churchSerial;
    private String name;
    private LocalDateTime createDt;
    private String createWho;
    private LocalDateTime updateDt;
    private String updateWho;

    public long getGroupSerial() {
        return groupSerial;
    }

    public void setGroupSerial(long groupSerial) {
        this.groupSerial = groupSerial;
    }

    public long getChurchSerial() {
        return churchSerial;
    }

    public void setChurchSerial(long churchSerial) {
        this.churchSerial = churchSerial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
