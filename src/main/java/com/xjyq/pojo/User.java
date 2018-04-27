package com.xjyq.pojo;

import java.util.Date;


public class User {
    private Integer id;

    private String realName;

    private String mobile;

    private String password;

    private Integer age;

    private String idNum;

    private Integer zhimaScore;

    private String qqNum;

    private String city;

    private String address;

    private Integer education;

    private Boolean xueXin;

    private Boolean hasDelete;

    private Integer channelId;

    private Integer state; //审核状态

    private Integer auditor; //审核人

    private Integer secondAuditor;

    private Date createTime;

    private Date updateTime;

    private String remark; //审核备注

    private String reportPic; //资信报告

    private Boolean hasRenew; //是否可以续借

    public User(Integer id, String realName, String mobile, String password, Integer age, String idNum, Integer zhimaScore, String qqNum, String city, String address, Integer education, Boolean xueXin, Boolean hasDelete, Integer channelId, Integer state, Integer auditor, Integer secondAuditor, Date createTime, Date updateTime, String remark, String reportPic, Boolean hasRenew) {
        this.id = id;
        this.realName = realName;
        this.mobile = mobile;
        this.password = password;
        this.age = age;
        this.idNum = idNum;
        this.zhimaScore = zhimaScore;
        this.qqNum = qqNum;
        this.city = city;
        this.address = address;
        this.education = education;
        this.xueXin = xueXin;
        this.hasDelete = hasDelete;
        this.channelId = channelId;
        this.state = state;
        this.auditor = auditor;
        this.secondAuditor = secondAuditor;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
        this.reportPic = reportPic;
        this.hasRenew = hasRenew;
    }

    public User() {super();}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public Integer getZhimaScore() {
        return zhimaScore;
    }

    public void setZhimaScore(Integer zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Boolean getXueXin() {
        return xueXin;
    }

    public void setXueXin(Boolean xueXin) {
        this.xueXin = xueXin;
    }

    public Boolean getHasDelete() {
        return hasDelete;
    }

    public void setHasDelete(Boolean hasDelete) {
        this.hasDelete = hasDelete;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAuditor() {
        return auditor;
    }

    public void setAuditor(Integer auditor) {
        this.auditor = auditor;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReportPic() {
        return reportPic;
    }

    public void setReportPic(String reportPic) {
        this.reportPic = reportPic;
    }

    public Boolean getHasRenew() {
        return hasRenew;
    }

    public void setHasRenew(Boolean hasRenew) {
        this.hasRenew = hasRenew;
    }

    public Integer getSecondAuditor() {
        return secondAuditor;
    }

    public void setSecondAuditor(Integer secondAuditor) {
        this.secondAuditor = secondAuditor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}