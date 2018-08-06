package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 订单融资申请转发中证
 * @author cp
 * @date 2018/8/2
 */
public class LoanFinancing extends BaseDto{
    private String channelCode;             // CHANNEL_CODE	接入机构号	VARCHAR(8)	Y	由银行定义
    private String customerCode;            // CUSTOMER_CODE	客户社会统一信用代码	VARCHAR2(100)	Y	如客户无“社会信用代码”则输入“组织机构代码”
    private String customerName;            // CUSTOMER_NAME	客户名称	VARCHAR2(100)	Y
    private String orderNo;                 // ORDER_NO	    订单编号	VARCHAR2(100)	Y	订单编号唯一、防重
    private String orderAmonunt;            // ORDER_AMOUNT	订单金额	NUMBER(16,2)	Y
    private String orderDate;               // ORDER_DATE	订单日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String selfPay;                 // SELF_PAY	自有资金付款金额	NUMBER(16,2)	Y
    private String selfPayRate;             // SELF_PAY_RATE	自有资金支付占比	NUMBER(5，2)	Y	单位：%
    private String bpmApproveDate;          // BPM_APPROVE_DATE	BPM审批通过日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String brachCompany;            // BRACH_COMPANY	所属分公司	VARCHAR2(120)	Y
    private String brachAccount;            // BRACH_ACCOUNT	分公司账户	VARCHAR2(32)	Y
    private String manageProvince;          // MANAGE_PROVINCE	经营省份	VARCHAR2(50)	Y
    private String manageCity;              // MANAGE_CITY	经营地市	VARCHAR2(50)	Y
    private String attribute1;              // ATTRIBUTE1 	预留字段1	VARCHAR2(100)	N
    private String attribute2;              // ATTRIBUTE2	    预留字段2	VARCHAR2(100)	N
    private String attribute3;              // ATTRIBUTE3	    预留字段3	VARCHAR2(100)	N
    private String attribute4;              // ATTRIBUTE4	    预留字段4	VARCHAR2(100)	N
    private String attribute5;              // ATTRIBUTE5 	预留字段5	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "LoanFinancing{" +
                "channelCode='" + channelCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", orderAmonunt='" + orderAmonunt + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", selfPay='" + selfPay + '\'' +
                ", selfPayRate='" + selfPayRate + '\'' +
                ", bpmApproveDate='" + bpmApproveDate + '\'' +
                ", brachCompany='" + brachCompany + '\'' +
                ", brachAccount='" + brachAccount + '\'' +
                ", manageProvince='" + manageProvince + '\'' +
                ", manageCity='" + manageCity + '\'' +
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderAmonunt() {
        return orderAmonunt;
    }

    public void setOrderAmonunt(String orderAmonunt) {
        this.orderAmonunt = orderAmonunt;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getSelfPay() {
        return selfPay;
    }

    public void setSelfPay(String selfPay) {
        this.selfPay = selfPay;
    }

    public String getSelfPayRate() {
        return selfPayRate;
    }

    public void setSelfPayRate(String selfPayRate) {
        this.selfPayRate = selfPayRate;
    }

    public String getBpmApproveDate() {
        return bpmApproveDate;
    }

    public void setBpmApproveDate(String bpmApproveDate) {
        this.bpmApproveDate = bpmApproveDate;
    }

    public String getBrachCompany() {
        return brachCompany;
    }

    public void setBrachCompany(String brachCompany) {
        this.brachCompany = brachCompany;
    }

    public String getBrachAccount() {
        return brachAccount;
    }

    public void setBrachAccount(String brachAccount) {
        this.brachAccount = brachAccount;
    }

    public String getManageProvince() {
        return manageProvince;
    }

    public void setManageProvince(String manageProvince) {
        this.manageProvince = manageProvince;
    }

    public String getManageCity() {
        return manageCity;
    }

    public void setManageCity(String manageCity) {
        this.manageCity = manageCity;
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
