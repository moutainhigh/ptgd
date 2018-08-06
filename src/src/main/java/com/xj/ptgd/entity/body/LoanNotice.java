package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 放款通知推送中证
*  @author cp
 * @date 2018/8/2
 */
public class LoanNotice extends BaseDto {
    private String channelCode;             // CHANNEL_CODE	接入机构号	VARCHAR(8)	Y	由银行定义
    private String customerCode;            // CUSTOMER_CODE	社会统一信用代码	VARCHAR2(100)	Y
    private String customerName;            // CUSTOMER_NAME	企业名称	VARCHAR2(100)	Y
    private String ownerName;               // OWNER_NAME	企业主姓名	VARCHAR2(100)	Y
    private String ownerIdCard;             // OWNER_IDCARD	企业主身份证号	VARCHAR2(18)	Y
    private String ownerPhoneno;            // OWNER_PHONENO	企业主手机号	VARCHAR2(11)	Y
    private String executeRate;             // EXECUTE_RATE	执行利率	NUMBER(16,2)	Y
    private String orderNo;                 // ORDER_NO	订单编号	VARCHAR2(30)	Y
    private String lousNo;                  // LOUS_NO	借据编号	NUMBER(30)	Y
    private String loaMoney;                // LOAN_MONEY	放款金额	NUMBER(16,2)	Y
    private String loanStartDate;           // LOAN_START_DATE	放款起始日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String loanEndDate;             // LOAN_END_DATE	放款到期日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String availableLimit;          // AVAILABLE_LIMIT	可用额度	NUMBER(16,2)	Y
    private String attribute1;              // ATTRIBUTE1 	预留字段1	VARCHAR2(100)	N
    private String attribute2;              // ATTRIBUTE2	    预留字段2	VARCHAR2(100)	N
    private String attribute3;              // ATTRIBUTE3	    预留字段3	VARCHAR2(100)	N
    private String attribute4;              // ATTRIBUTE4	    预留字段4	VARCHAR2(100)	N
    private String attribute5;              // ATTRIBUTE5 	预留字段5	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "LoanNotice{" +
                "channelCode='" + channelCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerIdCard='" + ownerIdCard + '\'' +
                ", ownerPhoneno='" + ownerPhoneno + '\'' +
                ", executeRate='" + executeRate + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", lousNo='" + lousNo + '\'' +
                ", loaMoney='" + loaMoney + '\'' +
                ", loanStartDate='" + loanStartDate + '\'' +
                ", loanEndDate='" + loanEndDate + '\'' +
                ", availableLimit='" + availableLimit + '\'' +
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerIdCard() {
        return ownerIdCard;
    }

    public void setOwnerIdCard(String ownerIdCard) {
        this.ownerIdCard = ownerIdCard;
    }

    public String getOwnerPhoneno() {
        return ownerPhoneno;
    }

    public void setOwnerPhoneno(String ownerPhoneno) {
        this.ownerPhoneno = ownerPhoneno;
    }

    public String getExecuteRate() {
        return executeRate;
    }

    public void setExecuteRate(String executeRate) {
        this.executeRate = executeRate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getLousNo() {
        return lousNo;
    }

    public void setLousNo(String lousNo) {
        this.lousNo = lousNo;
    }

    public String getLoaMoney() {
        return loaMoney;
    }

    public void setLoaMoney(String loaMoney) {
        this.loaMoney = loaMoney;
    }

    public String getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public String getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public String getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(String availableLimit) {
        this.availableLimit = availableLimit;
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
