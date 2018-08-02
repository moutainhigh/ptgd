package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;


public class TestBody extends BaseDto {
    private String billKey;

    private String companyId;

    private String beginNum;

    public String getBillKey() {
        return billKey;
    }

    public void setBillKey(String billKey) {
        this.billKey = billKey;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(String beginNum) {
        this.beginNum = beginNum;
    }

    @Override
    public String toString() {
        return "TestBody{" +
                "billKey='" + billKey + '\'' +
                ", companyId='" + companyId + '\'' +
                ", beginNum='" + beginNum + '\'' +
                '}';
    }
}
