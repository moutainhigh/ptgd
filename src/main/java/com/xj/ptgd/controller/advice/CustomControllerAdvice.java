package com.xj.ptgd.controller.advice;

import com.xj.ptgd.common.result.ResultEnum;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.entity.body.Error;
import com.xj.ptgd.entity.out.ErrorXMLOut;
import com.xj.ptgd.entity.base.XMLHeadDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
  * CustomControllerAdvice Controller自定义处理
  * @author wkm
  * @since 2018/7/30
  */
@ControllerAdvice
public class CustomControllerAdvice {
     /**
      * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
      * @param binder
      */
     @InitBinder
     public void initBinder(WebDataBinder binder) {}

     /**
      * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
      * @param model
      */
     @ModelAttribute
     public void addAttributes(Model model) {
//         model.addAttribute("author", "Magical Sam");
     }

     /**
      * 全局异常捕捉处理
      * @param ex
      * @return
      */
     @ResponseBody
     @ExceptionHandler(value = Exception.class)
     public String errorHandler(Exception ex) {
         ErrorXMLOut errorXMLOut = new ErrorXMLOut();
         XMLHeadDto headDto = new XMLHeadDto();
         Error error = new Error();
         error.setErrorCode(ResultEnum.http_status_internal_server_error.getCode());
         error.setErrorInfo(ResultEnum.http_status_internal_server_error.getMsg());
         errorXMLOut.setHead(headDto);
         ex.printStackTrace();
         if (ex instanceof RuntimeException) {

             return ResultUtil.getResult(errorXMLOut,ErrorXMLOut.class);
         }else if (ex instanceof MaxUploadSizeExceededException){//超出文件上传限定处理

             return null;
         }else{
             return ResultUtil.getResult(errorXMLOut,ErrorXMLOut.class);
         }
     }
}
