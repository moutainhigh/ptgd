package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 黑名单（贷款审核不通过名单）
 * @author hjd
 * @since 2018/8/2
 */
public class Blacklist extends BaseDto {
    private String channelCode; //接入机构号
    private Integer amount;       //总条数
    private String customerCode;   //客户社会信用代码
    private String customerName;   //客户名称
    private String pauseReason;    //暂停原因
    private String attribute1; //预留字段
    private String attribute2; //预留字段
    private String attribute3; //预留字段

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason;
    }

    @Override
    public String toString() {
        return "Blacklist{" +
                "channelCode='" + channelCode + '\'' +
                ", amount=" + amount +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", pauseReason='" + pauseReason + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                '}';
    }
}
