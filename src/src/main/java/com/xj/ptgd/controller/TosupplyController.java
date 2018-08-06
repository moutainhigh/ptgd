package com.xj.ptgd.controller;



import com.xj.ptgd.common.logs.LogUtils;
import com.xj.ptgd.common.util.JaxbUtil;
import com.xj.ptgd.common.util.MacUtil;
import com.xj.ptgd.entity.base.KeyDto;
import com.xj.ptgd.service.BlacklistService;
import com.xj.ptgd.service.IntendedService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * 供应链Controller
 * @author hjd
 * @since 2018/8/2
 */
@RestController
@RequestMapping(value="/tosup")
public class TosupplyController {
    static Logger logInfo = LogUtils.getInfoLogger();
    static Logger logError = LogUtils.getExceptionLogger();

    @Autowired
    private BlacklistService blacklistService;

    @Autowired
    private IntendedService intendedService;

    @RequestMapping(value = "/blacklist", method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String findBlacklist(){
        logInfo.info("\n开始发送请求");
        String retPost=blacklistService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(blacklistService.findBlacklist());
    }

    @RequestMapping(value = "/inten", method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String findIntend(){
        logInfo.info("\n开始发送请求");
        String retPost=intendedService.sendPost();
        logInfo.info("\n请求结束\nretPost: "+retPost);
        return MacUtil.addMac(intendedService.findIntended());
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
}
