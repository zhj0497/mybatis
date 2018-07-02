package com.cnepay.mybatis.domain;

import java.util.Date;

public class AuthData {




    private String accountNo;


    private Date createDate;


    private String idCard;


    private Date lastUpDate;


    private String mobileNo;


    private Integer status;


    private String userName;



    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getLastUpDate() {
        return lastUpDate;
    }

    public void setLastUpDate(Date lastUpDate) {
        this.lastUpDate = lastUpDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "AuthData{" +
                ", accountNo='" + accountNo + '\'' +
                ", createDate=" + createDate +
                ", idCard='" + idCard + '\'' +
                ", lastUpDate=" + lastUpDate +
                ", mobileNo='" + mobileNo + '\'' +
                ", status=" + status +
                ", userName='" + userName + '\'' +
                '}';
    }
}