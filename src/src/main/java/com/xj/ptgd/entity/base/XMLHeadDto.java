package com.xj.ptgd.entity.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Head", propOrder = {"ChnNo","FTranCode","InstID","TrmSeqNumnNo","TranDateTime","ErrCode"})
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLHeadDto {
    @XmlElement(name ="ChnNo")
    private String ChnNo;  //渠道号

    @XmlElement(name="FTranCode")
    private String FTranCode;  //交易码

    @XmlElement(name="InstID")
    private String InstID;  //机构号

    @XmlElement(name="TrmSeqNumnNo")
    private String TrmSeqNumnNo;  //终端流水号

    @XmlElement(name="TranDateTime")
    private String TranDateTime;  //交易日期时间

    @XmlElement(name="ErrCode")
    private String ErrCode;  //错误码

    public String getChnNo() {
        return ChnNo;
    }

    public void setChnNo(String chnNo) {
        ChnNo = chnNo;
    }

    public String getFTranCode() {
        return FTranCode;
    }

    public void setFTranCode(String FTranCode) {
        this.FTranCode = FTranCode;
    }

    public String getInstID() {
        return InstID;
    }

    public void setInstID(String instID) {
        InstID = instID;
    }


    public String getTranDateTime() {
        return TranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        TranDateTime = tranDateTime;
    }

    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String errCode) {
        ErrCode = errCode;
    }

    public String getTrmSeqNumnNo() {
        return TrmSeqNumnNo;
    }

    public void setTrmSeqNumnNo(String trmSeqNumnNo) {
        TrmSeqNumnNo = trmSeqNumnNo;
    }

    @Override
    public String toString() {
        return "XMLHeadDto{" +
                "ChnNo='" + ChnNo + '\'' +
                ", FTranCode='" + FTranCode + '\'' +
                ", InstID='" + InstID + '\'' +
                ", TrmSeqNumnNo='" + TrmSeqNumnNo + '\'' +
                ", TranDateTime='" + TranDateTime + '\'' +
                ", ErrCode='" + ErrCode + '\'' +
                '}';
    }
}
