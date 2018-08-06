package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.IntendedDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.Intended;

import com.xj.ptgd.entity.body.IntendedList;
import com.xj.ptgd.entity.out.IntendedListXMLOut;
import com.xj.ptgd.entity.out.IntendedXMLOut;
import com.xj.ptgd.service.IntendedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * IntendedServiceImpl
 * @author hjd
 * @since  2018/8/2
 */
@Service
public class IntendedServiceImpl implements IntendedService {

    @Autowired
    private IntendedDao intendedDao;

  public String findIntended() {
        IntendedListXMLOut ret=new IntendedListXMLOut();
        XMLHeadDto head=new XMLHeadDto();
        IntendedList intendedList=new IntendedList();
        Intended intended=new Intended();
        Intended i=new Intended();
        i.setChannelCode("777");
        intended.setChannelCode("7");
        i.setTotalLimit(1);
        intended.setCustomerCode("77");
        List<Intended> frame=new ArrayList<Intended>();
        frame.add(intended);
        frame.add(i);
        intendedList.setFrame(frame);
        //intendedList.setFrame(intendedDao.findIntended());
        ret.setBody(intendedList);
        return ResultUtil.setHeadAndGetResult(head,ret,IntendedListXMLOut.class);
    }

    @Override
    public String sendPost() {
        String url = "http://192.168.99.19:8080/tosup/post";
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
