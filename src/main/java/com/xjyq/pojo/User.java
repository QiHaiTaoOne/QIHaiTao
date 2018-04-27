package com.xjyq.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String realname;

    private String mobile;

    private String password;

    private Integer age;

    private String idnum;

    private Integer zhimascore;

    private String qqnum;

    private String city;

    private String address;

    private Integer education;

    private Boolean xuexin;

    private Boolean hasdelete;

    private Date createtime;

    private Date updatetime;

    private Integer channelid;

    private Integer state;

    private Integer auditor;

    private Integer secondauditor;

    private String remark;

    private String reportpic;

    private Boolean hasrenew;

    private String type;

    public User(Integer id, String realname, String mobile, String password, Integer age, String idnum, Integer zhimascore, String qqnum, String city, String address, Integer education, Boolean xuexin, Boolean hasdelete, Date createtime, Date updatetime, Integer channelid, Integer state, Integer auditor, Integer secondauditor, String remark, String reportpic, Boolean hasrenew, String type) {
        this.id = id;
        this.realname = realname;
        this.mobile = mobile;
        this.password = password;
        this.age = age;
        this.idnum = idnum;
        this.zhimascore = zhimascore;
        this.qqnum = qqnum;
        this.city = city;
        this.address = address;
        this.education = education;
        this.xuexin = xuexin;
        this.hasdelete = hasdelete;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.channelid = channelid;
        this.state = state;
        this.auditor = auditor;
        this.secondauditor = secondauditor;
        this.remark = remark;
        this.reportpic = reportpic;
        this.hasrenew = hasrenew;
        this.type = type;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public Integer getZhimascore() {
        return zhimascore;
    }

    public void setZhimascore(Integer zhimascore) {
        this.zhimascore = zhimascore;
    }

    public String getQqnum() {
        return qqnum;
    }

    public void setQqnum(String qqnum) {
        this.qqnum = qqnum == null ? null : qqnum.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Boolean getXuexin() {
        return xuexin;
    }

    public void setXuexin(Boolean xuexin) {
        this.xuexin = xuexin;
    }

    public Boolean getHasdelete() {
        return hasdelete;
    }

    public void setHasdelete(Boolean hasdelete) {
        this.hasdelete = hasdelete;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
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

    public Integer getSecondauditor() {
        return secondauditor;
    }

    public void setSecondauditor(Integer secondauditor) {
        this.secondauditor = secondauditor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReportpic() {
        return reportpic;
    }

    public void setReportpic(String reportpic) {
        this.reportpic = reportpic == null ? null : reportpic.trim();
    }

    public Boolean getHasrenew() {
        return hasrenew;
    }

    public void setHasrenew(Boolean hasrenew) {
        this.hasrenew = hasrenew;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}