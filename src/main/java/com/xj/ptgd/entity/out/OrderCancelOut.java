package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.OrderCancel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 订单取消通知
 * @author cp
 * @date 2018/8/2
 */
@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCancelOut implements XMLBaseDto<XMLHeadDto,OrderCancel> {
    private XMLHeadDto Head;
    private OrderCancel Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public OrderCancel getBody() {
        return Body;
    }

    @Override
    public void setBody(OrderCancel body) {
        Body = body;
    }
}
