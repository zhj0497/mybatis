package com.cnepay.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class Channel implements Serializable{

    private Integer hasConfig;
    private Date createDate;

    private Date updateDate;

    private Long id;


    private String channelCode;


    private String channelName;


    private String notifyUrl;


    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }


    public String getChannelName() {
        return channelName;
    }


    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }


    public String getNotifyUrl() {
        return notifyUrl;
    }


    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }


    public Integer getStatus() {
        return status;
    }

    public Integer getHasConfig() {
        return hasConfig;
    }

    public void setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}