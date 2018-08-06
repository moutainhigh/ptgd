package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.NetloanDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.Netloan;
import com.xj.ptgd.entity.body.NetloanList;
import com.xj.ptgd.entity.out.NetloanlistXMLOut;
import com.xj.ptgd.service.NetloanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * NetloanServiceImpl
 * @author hjd
 * @since 2018/8/2
 */
@Service
public class NetloanServiceImpl implements NetloanService{

    @Autowired
    private NetloanDao netloanDao;

    @Override
    public String findNetloan() {
        NetloanlistXMLOut ret=new NetloanlistXMLOut();
        XMLHeadDto head=new XMLHeadDto();
        NetloanList netloanList=new NetloanList();
        List<Netloan> frame=new ArrayList<Netloan>();
        Netloan netloan=new Netloan();
        Netloan n=new Netloan();
        n.setChannelCode("77");
        n.setCustomerCode("77777");
        netloan.setChannelCode("11");
        frame.add(netloan);
        frame.add(n);
        netloanList.setFrame(frame);

        //netloanList.setFrame(netloanDao.findNetloan());
        ret.setBody(netloanList);
        return ResultUtil.setHeadAndGetResult(head,ret,NetloanlistXMLOut.class);
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
