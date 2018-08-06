package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.BlacklistDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.Blacklist;
import com.xj.ptgd.entity.body.BlacklistList;
import com.xj.ptgd.entity.out.BlacklistListXMLOut;
import com.xj.ptgd.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * BlacklistServiceImpl
 * @author hjd
 * @since 2018/8/2
 */
@Service
public class BlacklistServiceImpl implements BlacklistService{
    @Autowired
    private BlacklistDao blacklistDao;

    @Override
    public String findBlacklist() {
        BlacklistListXMLOut ret=new BlacklistListXMLOut();
        XMLHeadDto head=new XMLHeadDto();
        BlacklistList blacklistList=new BlacklistList();
        Blacklist blacklist=new Blacklist();
        Blacklist b=new Blacklist();
        blacklist.setAmount(4);
        b.setAmount(7);
        blacklist.setAttribute1("1");
        b.setAttribute2("2");
        List<Blacklist> frame=new ArrayList<Blacklist>();
        frame.add(blacklist);
        frame.add(b);
        blacklistList.setFrame(frame);
        //blacklistList.setFrame(blacklistDao.findBlacklist());
        ret.setBody(blacklistList);
        return ResultUtil.setHeadAndGetResult(head,ret,BlacklistListXMLOut.class);
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
