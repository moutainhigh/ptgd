package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 *  应答报文统一entity
 *  @author cp
 *  @date 2018/8/2
 */
public class BodyEntity extends BaseDto {
    private String resultFlag;      // RESULT_FLAG	成功标志	VARCHAR2(1)	Y	0：失败 1：成功
    private String message;         // MESSAGE	结果信息	VARCHAR2(200)	N	失败时有错误信息
    private String Attribute6;      // ATTRIBUTE6	备用字段6	VARCHAR2(100)	N
    private String Attribute7;      // ATTRIBUTE7	备用字段7	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "BodyEntity{" +
                "resultFlag='" + resultFlag + '\'' +
                ", message='" + message + '\'' +
                ", Attribute6='" + Attribute6 + '\'' +
                ", Attribute7='" + Attribute7 + '\'' +
                '}';
    }

    public String getResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(String resultFlag) {
        this.resultFlag = resultFlag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAttribute6() {
        return Attribute6;
    }

    public void setAttribute6(String attribute6) {
        Attribute6 = attribute6;
    }

    public String getAttribute7() {
        return Attribute7;
    }

    public void setAttribute7(String attribute7) {
        Attribute7 = attribute7;
    }
}
