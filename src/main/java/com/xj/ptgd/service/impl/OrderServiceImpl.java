package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.OrderDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.Order;
import com.xj.ptgd.entity.body.OrderList;
import com.xj.ptgd.entity.out.OrderListXMLOut;
import com.xj.ptgd.entity.out.OrderXMLOut;
import com.xj.ptgd.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderServiceImpl
 * @author hjd
 * @since 2018/8/2
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public String findOrder() {
        OrderListXMLOut ret=new OrderListXMLOut();
        XMLHeadDto head=new XMLHeadDto();
        OrderList orderList=new OrderList();
        List<Order> frame=new ArrayList<Order>();
        Order order=new Order();
        order.setChannelCode("9527");
        order.setCustomerCode("4396");
        order.setCustomerName("clearlove7");
        order.setOrderNo("7");
        Order o=new Order();
        o.setChannelCode("7777");
        o.setCustomerCode("7");
        o.setCustomerName("7jiang");
        o.setOrderNo("7");
        frame.add(order);
        frame.add(o);
        System.out.println(frame.toString());
        orderList.setFrame(frame);
        //orderList.setFrame(orderDao.findOrder());
        ret.setBody(orderList);
        return ResultUtil.setHeadAndGetResult(head,ret,OrderListXMLOut.class);
    }

    @Override
    public String sendPost() {
        String url = "http://192.168.99.19:8080/ptceb/post";
        HttpClientXMLUtil tmi = new HttpClientXMLUtil();
        String resXML="000313<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" +
                "<out>" +
                "   <Head>" +
                "       <version>1.0.1</version>" +
                "       <InstId>000000000000000</InstId>" +
                "       <AnsTranCode>Error</AnsTranCode>" +
                "       <TrmSeqNum>00711497180212094224</TrmSeqNum>" +
                "   </Head>" +
                "   <tout>" +
                "       <errorCode>DEF0002</errorCode>" +
                "       <errorMessage></errorMessage>" +
                "       <errorDetail></errorDetail>" +
                "   </tout>" +
                "</out>32E5677A7BF5B546";
        return tmi.post(url,resXML);
    }
}
