package com.xj.ptgd.controller;

import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.result.Result;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
  * UserController 
  * @author wkm
  * @since 2018/7/30
  */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userId", method = RequestMethod.GET ,produces = { "application/xml;charset=UTF-8" })
    public Result findByUserId(@RequestParam(value = "userId", required = true) int userId)  throws Exception{
        System.out.println("开始查询...");
        return ResultUtil.success(userService.findUserById(userId));
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET ,produces = { "application/xml;charset=UTF-8" })
    public Result findUsers() {
        org.slf4j.Logger log = LogUtils.getExceptionLogger();
        org.slf4j.Logger log1 = LogUtils.getInfoLogger();
        List ret = userService.findUsers();
        log.error("getExceptionLogger===日志测试");
        log1.info("getBussinessLogger===日志测试");
        System.out.println("开始查询...");
        return ResultUtil.success(ret) ;
    }

}