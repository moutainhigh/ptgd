package com.xj.ptgd.common.exception;

import com.xj.ptgd.common.result.ResultEnum;

 /**
  * DataNullException
  * @author wkm
  * @since 2018/7/30
  */
public class DataNullException extends CustomException{
    public DataNullException(ResultEnum resultEnum) {
        super(resultEnum);
    }
}
