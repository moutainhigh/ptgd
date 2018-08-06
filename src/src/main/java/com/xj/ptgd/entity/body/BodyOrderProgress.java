package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

/**
 * 订单进度查询--应答报文
 * @author cp
 * @date 2018/8/2
 */
public class BodyOrderProgress extends BaseDto{

    private String orderStatus;             // ORDER_STATUS	订单状态	VARCHAR2(1)	Y	00-支付拒绝,01-银行已受理,02-未支付,04-已放款,06-已取消
    private String attribute6;              // ATTRIBUTE6	备用字段6	VARCHAR2(100)	N
    private String attribute7;              // ATTRIBUTE7	备用字段7	VARCHAR2(100)	N
    private String attribute8;              // ATTRIBUTE8	备用字段8	VARCHAR2(100)	N

    @Override
    public String toString() {
        return "BodyOrderProgress{" +
                "orderStatus='" + orderStatus + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                '}';
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
}
