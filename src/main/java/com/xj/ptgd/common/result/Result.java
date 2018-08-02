package com.xj.ptgd.common.result;

import com.xj.ptgd.entity.base.BaseDto;
import com.xj.ptgd.entity.base.XMLHeadDto;

import javax.xml.bind.annotation.*;

/**
  * Result http请求返回的最外层对象
  * @author wkm
  * @since 2018/7/30
  */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Out")
@XmlType( propOrder = { "Head", "Body"})
public class Result<T> extends BaseDto {
    /* 头部信息 */
     private XMLHeadDto Head;

     /** 具体的内容. */
    private T Body;

     public XMLHeadDto getHead() {
         return Head;
     }

     public void setHead(XMLHeadDto head) {
         Head = head;
     }

     public T getBody() {
         return Body;
     }

     public void setBody(T body) {
         Body = body;
     }
     public String toString(){
         return "111";
     }
 }