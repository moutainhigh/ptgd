package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 客户网贷易额度查询--应答报文
 * @author cp
 * @date 2018/8/2
 */
public class BodyQueryLine extends BaseDto{
    private String limitBeginDate;          // LIMIT_BEGIN_DATE	额度开始日期	VARCHAR2(8)	Y	格式：yyyymmdd
    private String limitEndDate;            // LIMIT_END_DATE	额度到期日	VARCHAR2(8)	Y	格式：yyyymmdd
    private String totalLimit;              // TOTAL_LIMIT	总额度	NUMBER（16,2）	Y
    private String availableLimit;          // AVAILABLE_LIMIT	可用额度	NUMBER（16,2）	Y
    private String creditlineState;         // CREDITLINE_STATE	额度状态	VARCHAR2(10)	N	1-正常,2-暂停
    private String pauseReason;             // PAUSE_REASON	暂停原因	VARCHAR2(100)	N	暂停时，必填
    private String attribute6;              // ATTRIBUTE6	预留字段6	VARCHAR2(100)	N
    private String attribute7;              // ATTRIBUTE7	预留字段7	VARCHAR2(100)	N
    private String attribute8;              // ATTRIBUTE8	预留字段8	VARCHAR2(100)	N
    private String attribute9;              // ATTRIBUTE9	预留字段9	VARCHAR2(100)	N
    private String attribute10;              // ATTRIBUTE10	预留字段10	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "BodyQueryLine{" +
                "limitBeginDate='" + limitBeginDate + '\'' +
                ", limitEndDate='" + limitEndDate + '\'' +
                ", totalLimit='" + totalLimit + '\'' +
                ", availableLimit='" + availableLimit + '\'' +
                ", creditlineState='" + creditlineState + '\'' +
                ", pauseReason='" + pauseReason + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                '}';
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

    public String getCreditlineState() {
        return creditlineState;
    }

    public void setCreditlineState(String creditlineState) {
        this.creditlineState = creditlineState;
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }
}
