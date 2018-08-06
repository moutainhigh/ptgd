package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.BodyEntity;
import com.xj.ptgd.entity.body.BodyOrderProgress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class BodyOrderProgressXMLOut implements XMLBaseDto<XMLHeadDto,BodyOrderProgress> {
    private XMLHeadDto Head;
    private BodyOrderProgress Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public BodyOrderProgress getBody() {
        return Body;
    }

    @Override
    public void setBody(BodyOrderProgress body) {
        Body = body;
    }
}
