package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 推送客户额度信息
 * @author cp
 * @date 2018/8/2
 */
public class QuotaQuery extends BaseDto {
    private String channelCode; // CHANNEL_CODE	接入机构号	VARCHAR(8)	Y	由银行定义
    private String customerCode;    // CUSTOMER_CODE	客户社会信用代码	VARCHAR2(20)	Y	如客户无“社会信用代码”则输入“组织机构代码”　
    private String customerName;    // CUSTOMER_NAME	客户名称	VARCHAR2(120)	Y	　
    private String creditilineState;    // CREDITLINE_STATE	额度状态	VARCHAR2(10)	N	正常
    private String totalLimit;  // TOTAL_LIMIT	总额度	NUMBER（16,2）	Y	客户初始额度
    private String availableLimit; // AVAILABLE_LIMIT	可用额度	NUMBER（16,2）	Y	当前可用的额度
    private String limitBeginDate;  // LIMIT_BEGIN_DATE	额度开始日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String limitEndDate;    // LIMIT_END_DATE 	额度到期日	VARCHAR2(8)	Y	格式：yyyymmdd
    private String attribute1;      // ATTRIBUTE1	    备用字段1	VARCHAR2(100)	N
    private String attribute2;      // ATTRIBUTE2	    备用字段2	VARCHAR2(100)	N
    private String attribute3;      // ATTRIBUTE3	    备用字段3	VARCHAR2(100)	N
    private String attribute4;      // ATTRIBUTE4	    备用字段4	VARCHAR2(100)	N
    private String attribute5;      // ATTRIBUTE5	    备用字段5	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "QuotaQuery{" +
                "channelCode='" + channelCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", creditilineState='" + creditilineState + '\'' +
                ", totalLimit='" + totalLimit + '\'' +
                ", availableLimit='" + availableLimit + '\'' +
                ", limitBeginDate='" + limitBeginDate + '\'' +
                ", limitEndDate='" + limitEndDate + '\'' +
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

    public String getCreditilineState() {
        return creditilineState;
    }

    public void setCreditilineState(String creditilineState) {
        this.creditilineState = creditilineState;
    }

    public String getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(String totalLimit) {
        this.totalLimit = totalLimit;
    }

    public String getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(String availableLimit) {
        this.availableLimit = availableLimit;
    }

    public String getLimitBeginDate() {
        return limitBeginDate;
    }

    public void setLimitBeginDate(String limitBeginDate) {
        this.limitBeginDate = limitBeginDate;
    }

    public String getLimitEndDate() {
        return limitEndDate;
    }

    public void setLimitEndDate(String limitEndDate) {
        this.limitEndDate = limitEndDate;
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
