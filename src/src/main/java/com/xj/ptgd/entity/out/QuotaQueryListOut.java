package com.xj.ptgd.entity.out;

import com.xj.ptgd.entity.base.XMLBaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.QuotaQueryList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 推送客户额度信息集合
 * @author cp
 * @date 2018/8/2
 */
@XmlRootElement(name = "Out")
@XmlType(name="Out",propOrder = {"Head","Body"})
@XmlAccessorType(XmlAccessType.FIELD)
public class QuotaQueryListOut implements XMLBaseDto<XMLHeadDto,QuotaQueryList> {
    private XMLHeadDto Head;
    private QuotaQueryList Body;

    @Override
    public XMLHeadDto getHead() {
        return Head;
    }

    @Override
    public void setHead(XMLHeadDto head) {
        Head = head;
    }

    @Override
    public QuotaQueryList getBody() {
        return Body;
    }

    @Override
    public void setBody(QuotaQueryList body) {
        Body = body;
    }
}
