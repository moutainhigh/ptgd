package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 订单取消通知
 * @author cp
 * @date 2018/8/2
 */
public class OrderCancel extends BaseDto {
    private String channelCode;             //CHANNEL_CODE	接入机构号	VARCHAR(8)	Y	由银行定义
    private String customerCode;            // CUSTOMER_CODE	客户社会统一信用代码	VARCHAR2(100)	Y	如客户无“社会信用代码”则输入“组织机构代码”
    private String customerName;            // CUSTOMER_NAME	客户名称	VARCHAR2(100)	Y
    private String oederNo;                 // ORDER_NO	    订单编号	VARCHAR2(100)	Y
    private String attribute1;              // ATTRIBUTE1 	预留字段1	VARCHAR2(100)	N
    private String attribute2;              // ATTRIBUTE2	    预留字段2	VARCHAR2(100)	N
    private String attribute3;              // ATTRIBUTE3	    预留字段3	VARCHAR2(100)	N
    private String attribute4;              // ATTRIBUTE4	    预留字段4	VARCHAR2(100)	N
    private String attribute5;              // ATTRIBUTE5 	预留字段5	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "OrderCancel{" +
                "channelCode='" + channelCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", oederNo='" + oederNo + '\'' +
                ", attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                '}';
    }

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

    public String getOederNo() {
        return oederNo;
    }

    public void setOederNo(String oederNo) {
        this.oederNo = oederNo;
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
}
