package com.eoms.entity;

public class SysUsers {
    private String id;

    private String loginname;

    private String username;

    private String psw;

    private String sex;

    private String identityNum;

    private String birthday;

    private String enterDate;

    private String employeStatus;

    private String leaveDate;

    private String userNo;

    private String userHrNo;

    private String userOrder;

    private String locked;

    private String deleted;

    private String pwdUpdateDate;

    private String lastLoginDate;

    private String centreId;

    private String deptId;

    private String postId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate == null ? null : enterDate.trim();
    }

    public String getEmployeStatus() {
        return employeStatus;
    }

    public void setEmployeStatus(String employeStatus) {
        this.employeStatus = employeStatus == null ? null : employeStatus.trim();
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate == null ? null : leaveDate.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserHrNo() {
        return userHrNo;
    }

    public void setUserHrNo(String userHrNo) {
        this.userHrNo = userHrNo == null ? null : userHrNo.trim();
    }

    public String getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(String userOrder) {
        this.userOrder = userOrder == null ? null : userOrder.trim();
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    public void setPwdUpdateDate(String pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate == null ? null : pwdUpdateDate.trim();
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate == null ? null : lastLoginDate.trim();
    }

    public String getCentreId() {
        return centreId;
    }

    public void setCentreId(String centreId) {
        this.centreId = centreId == null ? null : centreId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }
}