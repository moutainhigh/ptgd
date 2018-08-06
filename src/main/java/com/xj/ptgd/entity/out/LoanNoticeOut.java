package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.LoanNotice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 放款通知推送中证
 *  @author cp
 * @date 2018/8/2
 */
@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class LoanNoticeOut implements XMLBaseDto<XMLHeadDto,LoanNotice> {
    private XMLHeadDto Head;
    private LoanNotice Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public LoanNotice getBody() {
        return Body;
    }

    @Override
    public void setBody(LoanNotice body) {
        Body = body;
    }
}
