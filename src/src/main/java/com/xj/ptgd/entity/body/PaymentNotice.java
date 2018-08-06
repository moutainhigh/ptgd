package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 推送借据及还款信息
 * @author cp
 * @date 2018/8/2
 */
public class PaymentNotice extends BaseDto {
    private String channelCode;             // CHANNEL_CODE	接入机构号	VARCHAR2(8)	Y
    private String repayNo;                 // REPAY_NO	还款流水号	VARCHAR2(20)	Y
    private String loanNo;                  // LOAN_NO	借据号	VARCHAR2(17)	Y
    private String loanBalance;             // LOAN_BALANCE	借据余额	NUMBER(16,2)	Y
    private String repayAmount;             // REPAY_AMOUNT	还款金额	NUMBER(16,2)	Y
    private String repayDatetime;           // REPAY_DATETIME	还款时间	VARCHAR2(8)	Y	格式为YYYYMMDD HHMMSS[这个格式已经超了8位长度]
    private String principalAmount;         // PRINCIPAL_AMOUNT	还本金额	NUMBER(16,2)	Y
    private String interestAmount;          // INTEREST_AMOUNT	还息金额	NUMBER(16,2)	Y
    private String availableLimit;          // 当前可用额度	NUMBER(16,2)	Y
    private String attribute1;              // ATTRIBUTE1 	预留字段1	VARCHAR2(100)	N
    private String attribute2;              // ATTRIBUTE2	    预留字段2	VARCHAR2(100)	N
    private String attribute3;              // ATTRIBUTE3	    预留字段3	VARCHAR2(100)	N
    private String attribute4;              // ATTRIBUTE4	    预留字段4	VARCHAR2(100)	N
    private String attribute5;              // ATTRIBUTE5 	预留字段5	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "PaymentNotice{" +
                "channelCode='" + channelCode + '\'' +
                ", repayNo='" + repayNo + '\'' +
                ", loanNo='" + loanNo + '\'' +
                ", loanBalance='" + loanBalance + '\'' +
                ", repayAmount='" + repayAmount + '\'' +
                ", repayDatetime='" + repayDatetime + '\'' +
                ", principalAmount='" + principalAmount + '\'' +
                ", interestAmount='" + interestAmount + '\'' +
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

    public String getRepayNo() {
        return repayNo;
    }

    public void setRepayNo(String repayNo) {
        this.repayNo = repayNo;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(String loanBalance) {
        this.loanBalance = loanBalance;
    }

    public String getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getRepayDatetime() {
        return repayDatetime;
    }

    public void setRepayDatetime(String repayDatetime) {
        this.repayDatetime = repayDatetime;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(String interestAmount) {
        this.interestAmount = interestAmount;
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
