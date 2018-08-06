package com.xj.ptgd.controller;

import com.xj.ptgd.common.util.JaxbUtil;
import com.xj.ptgd.common.util.MacUtil;
import com.xj.ptgd.entity.base.KeyDto;
import com.xj.ptgd.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

/**
 *  服务方-中证
 *
 */
@RestController
@RequestMapping(value = "/tochinacscs")
public class ChinaCscsSelfController {
    // 日志输出
    private Logger logger = LoggerFactory.getLogger(ChinaCscsSelfController.class);

    @Autowired
    LoanFinancingService loanFinancingService;
    @Autowired
    LoanNoticeService loanNoticeService;
    @Autowired
    OrderCancelService orderCancelService;
    @Autowired
    PaymentNoticeService paymentNoticeService;
    @Autowired
    QuotaQueryService quotaQueryService;

    /**
     *  推送客户额度信息
     *  供应链手动维护额度信息推送给中证系统
     * @return
     */
    @RequestMapping(value = "/quotaquery",method = {RequestMethod.GET},produces = { "application/xml;charset=UTF-8" })
    public String findQuotaquery(){
        logger.info("开始发送请求");
        String retPost = quotaQueryService.sendPost();
        logger.info("请求结束   retPost: " + retPost);
        return MacUtil.addMac(quotaQueryService.findQuotaQuery());
    }

    /**
     *  订单融资申请转发中证
     *  供应链订单融资信息转发至中证
     * @return
     */
    @RequestMapping(value = "/loanfinancing",method = {RequestMethod.GET},produces = { "application/xml;charset=UTF-8" })
    public String findLoanFinancing(@RequestBody String req){
        logger.info("ChinaCscsSelfController----findLoanFinancing--订单融资申请转发中证");
        String retPost = loanFinancingService.sendPost();
        logger.info("请求结束   retPost: " + retPost);
        return MacUtil.addMac(loanFinancingService.findById("1"));
    }

    /**
     *  放款通知推送中证
     *  供应链将放款通知信息推送至中证
     * @return
     */
    @RequestMapping(value = "/loannotice",method = {RequestMethod.GET},produces = { "application/xml;charset=UTF-8" })
    public String findLoanNotice(@RequestBody String req){
        logger.info("ChinaCscsSelfController----findLoanNotice--放款通知推送中证");
        String retPost = loanNoticeService.sendPost();
        logger.info("请求结束   retPost: " + retPost);
        return MacUtil.addMac(loanNoticeService.findById("1"));
    }

    /**
     *  订单取消通知
     *  光大银行将取消的订单信息通过此接口通知中证
     * @return
     */
    @RequestMapping(value = "/ordercancel",method = {RequestMethod.GET},produces = { "application/xml;charset=UTF-8" })
    public String findOrderCancel(@RequestBody String req){
        logger.info("ChinaCscsSelfController----findOrderCancel--订单取消通知");
        String retPost = orderCancelService.sendPost();
        logger.info("请求结束   retPost: " + retPost);
        return MacUtil.addMac(orderCancelService.findById("1"));
    }

    /**
     *  推送借据及还款信息
     *  供应链通过此接口推送借据及还款信息
     * @return
     */
    @RequestMapping(value = "/paymentnotice",method = {RequestMethod.GET},produces = { "application/xml;charset=UTF-8" })
    public String findPaymentNotice(@RequestBody String req){
        logger.info("ChinaCscsSelfController----findPaymentNotice--推送借据及还款信息");
        String retPost = paymentNoticeService.sendPost();
        logger.info("请求结束   retPost: " + retPost);
        return MacUtil.addMac(paymentNoticeService.findById("1"));
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST ,produces = { "application/xml;charset=UTF-8" })
    public String getPost(@RequestBody String req){
        logger.info("接收请求参数 req :"+req);
        String xml = MacUtil.subXMLForMAC(req);
        try{
            JaxbUtil ju =new JaxbUtil(KeyDto.class);
            KeyDto country = ju.fromXml(xml);
        }catch (JAXBException e){
            e.printStackTrace();
            logger.error(" 注:(大小写敏感)请核对实体属性与xml标签    xml:"+xml);
        }
        logger.info("返回请求结果 xml :"+xml);
        return xml;
    }
}