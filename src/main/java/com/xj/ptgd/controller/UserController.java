package com.xj.ptgd.controller;

import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.result.Result;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
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
        return ResultUtil.success(null,userService.findUserById(userId));
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET ,produces = MediaType.TEXT_XML_VALUE)
    public String findUsers() {
        Logger log = LogUtils.getExceptionLogger();
        Logger log1 = LogUtils.getInfoLogger();
        List ret = userService.findUsers();
        log.error("getExceptionLogger===日志测试");
        log1.info("getBussinessLogger===日志测试");
        System.out.println("开始查询...");
        Result result = ResultUtil.success(null,ret);
        return "000313<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><out><head><Version>1.0.1</Version><InstId>000000000000000</InstId><AnsTranCode>Error</AnsTranCode><TrmSeqNum>00711497180212094224</TrmSeqNum></head><tout><errorCode>DEF0002</errorCode><errorMessage></errorMessage><errorDetail></errorDetail></tout></out>32E5677A7BF5B546";
    }

}