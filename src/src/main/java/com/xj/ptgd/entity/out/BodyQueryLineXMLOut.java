package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.BodyEntity;
import com.xj.ptgd.entity.body.BodyQueryLine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class BodyQueryLineXMLOut implements XMLBaseDto<XMLHeadDto,BodyQueryLine> {
    private XMLHeadDto Head;
    private BodyQueryLine Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public BodyQueryLine getBody() {
        return Body;
    }

    @Override
    public void setBody(BodyQueryLine body) {
        Body = body;
    }
}
