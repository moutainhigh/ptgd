package com.xj.ptgd.controller;


import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.util.JaxbUtil;
import com.xj.ptgd.common.util.MacUtil;
import com.xj.ptgd.entity.base.KeyDto;
import com.xj.ptgd.entity.body.Netloan;
import com.xj.ptgd.entity.body.Order;
import com.xj.ptgd.service.NetloanService;
import com.xj.ptgd.service.OrderService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.util.List;

import static com.xj.ptgd.controller.TosupplyController.logInfo;
import static com.xj.ptgd.controller.UserController.logError;

/**
 * 普天光大Controller
 * @author hjd
 * @since  2018/8/2
 */

@RestController
@RequestMapping(value = "/ptceb")
public class ToptcebController {

    static Logger logInfo = LogUtils.getInfoLogger();
    static Logger logError = LogUtils.getExceptionLogger();

    @Autowired
    private NetloanService netloanService;

    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "/netloan",method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String findNetloan(){
        logInfo.info("\n开始发送请求");
        String retPost=netloanService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(netloanService.findNetloan());
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String findOrder(){
        logInfo.info("\n开始发送请求");
        String retPost=orderService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(orderService.findOrder());
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

    @RequestMapping(value = "/findOrder", method = RequestMethod.GET ,produces = MediaType.TEXT_XML_VALUE)
    public String findUsers() {
        logInfo.info("\n开始发送请求");
        String retPost=orderService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(orderService.findOrder());
    }

}
