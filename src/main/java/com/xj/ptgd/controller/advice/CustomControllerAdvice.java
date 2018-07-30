package com.xj.ptgd.controller.advice;

import com.xj.ptgd.common.exception.CustomException;
import com.xj.ptgd.common.exception.DataNullException;
import com.xj.ptgd.common.result.Result;
import com.xj.ptgd.common.result.ResultUtil;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

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
     public Result errorHandler(Exception ex) {
         if (ex instanceof CustomException) {
             CustomException customException = (CustomException) ex;
             if(ex instanceof DataNullException){
                 return ResultUtil.success(customException.getCode(), customException.getMessage(),null);
             }else{
                 return ResultUtil.error(customException.getCode(), customException.getMessage());
             }
         }else {
             return ResultUtil.error(-999, "未知错误");
         }
     }
}
