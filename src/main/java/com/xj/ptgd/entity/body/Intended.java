package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 意向客户额度
 * @author hjd
 * @since 2018/8/2
 */
public class Intended extends BaseDto {
    /*交易码	Gxx 推送意向客户额度
     服务方	供应链
     接口功能概述	中证将意向客户额度推送供应链
     调用说明	中证将意向客户额度推送供应链，每次为一个客户的意向额度
    */
    private String channelCode;    //接入机构号
    private String customerCode;   //客户社会信用代码
    private String customerName;   //客户名称
    private Integer totalLimit;    //意向额度
    private String attribute1; //预留字段
    private String attribute2; //预留字段
    private String attribute3; //预留字段
    private String attribute4; //预留字段
    private String attribute5; //预留字段


    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
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

    public Integer getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Integer totalLimit) {
        this.totalLimit = totalLimit;
    }

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

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    @Override
    public String toString() {
        return "Intended{" +
                "channelCode='" + channelCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalLimit=" + totalLimit +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                '}';
    }
}
