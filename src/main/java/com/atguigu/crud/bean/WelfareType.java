package com.atguigu.crud.bean;

public class WelfareType {
    private Integer welfareTypeId;

    private String welfareTypeName;

    public Integer getWelfareTypeId() {
        return welfareTypeId;
    }

    public void setWelfareTypeId(Integer welfareTypeId) {
        this.welfareTypeId = welfareTypeId;
    }

    public String getWelfareTypeName() {
        return welfareTypeName;
    }

    public void setWelfareTypeName(String welfareTypeName) {
        this.welfareTypeName = welfareTypeName == null ? null : welfareTypeName.trim();
    }
}