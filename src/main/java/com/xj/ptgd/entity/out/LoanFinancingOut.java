package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.LoanFinancing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 订单融资申请转发中证
 * @author cp
 * @date 2018/8/2
 */
@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanFinancingOut implements XMLBaseDto<XMLHeadDto,LoanFinancing> {
    private XMLHeadDto Head;
    private LoanFinancing Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public LoanFinancing getBody() {
        return Body;
    }

    @Override
    public void setBody(LoanFinancing body) {
        Body = body;
    }
}
