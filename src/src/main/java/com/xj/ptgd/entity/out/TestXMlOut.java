package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.User;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class TestXMlOut implements XMLBaseDto<XMLHeadDto,User> {
    private XMLHeadDto Head;
    private User Body;

    public XMLHeadDto getHead() {
        return Head;
    }

    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    public User getBody() {
        return Body;
    }

    public void setBody(User body) {
        Body = body;
    }
}




