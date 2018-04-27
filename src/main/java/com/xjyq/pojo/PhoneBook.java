package com.xjyq.pojo;

import java.util.Date;

public class PhoneBook {
    private Integer id;

    private String name;

    private String mobile;

    private Integer userId;

    private Date createTime;

    public PhoneBook(Integer id, String name, String mobile, Integer userId, Date createTime) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.userId = userId;
        this.createTime = createTime;
    }

    public PhoneBook() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}