package com.xj.ptgd.controller;

import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.util.JaxbUtil;
import com.xj.ptgd.common.util.MacUtil;
import com.xj.ptgd.entity.base.KeyDto;
import com.xj.ptgd.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
  * UserController 
  * @author wkm
  * @since 2018/7/30
  */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    static Logger logInfo = LogUtils.getInfoLogger();
    static Logger logError = LogUtils.getExceptionLogger();
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userId", method = RequestMethod.GET ,produces = { "application/xml;charset=UTF-8" })
    public String findByUserId(@RequestParam(value = "userId", required = true) int userId)  throws Exception{
        return userService.findUserById(userId);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String getPost(@RequestBody String req){
        logInfo.info("\n接收请求参数\nreq :"+req);
        String xml = MacUtil.subXMLForMAC(req);
        try{
            JaxbUtil ju =new JaxbUtil(KeyDto.class);
            KeyDto country = ju.fromXml(xml);
        }catch (JAXBException e){
            e.printStackTrace();
            logError.error("注:(大小写敏感)请核对实体属性与xml标签\n" +
                    "xml:"+xml);
        }
        logInfo.info("\n返回请求结果\nxml :"+xml);
        return xml;
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET ,produces = MediaType.TEXT_XML_VALUE)
    public String findUsers() {
        logInfo.info("\n开始发送请求");
        String retPost=userService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(userService.findUsers());
    }

}