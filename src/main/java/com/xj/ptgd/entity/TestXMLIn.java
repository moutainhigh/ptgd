package com.xj.ptgd.entity;

import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.TestBody;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="In")
@XmlType(name="In",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class TestXMLIn {
    private XMLHeadDto Head;
    private TestBody Body;

    public XMLHeadDto getHead() {
        return Head;
    }

    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    public TestBody getBody() {
        return Body;
    }

    public void setBody(TestBody body) {
        Body = body;
    }

    @Override
    public String toString() {
        return "TestXMLIn{" +
                "Head=" + Head.toString() +
                ", Body=" + Body.toString() +
                '}';
    }
}
