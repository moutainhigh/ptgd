package com.xj.ptgd.common.result;

import com.xj.ptgd.entity.base.XMLHeadDto;

/**
  * ResultUtil
  * @author wkm
  * @since 2018/7/30
  */
public class ResultUtil {
    public static Result success(XMLHeadDto head,Object object) {
        Result result = new Result();
        result.setHead(head);
        result.setBody(object);
        return result;
    }
}