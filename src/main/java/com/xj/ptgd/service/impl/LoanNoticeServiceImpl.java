package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.LoanNoticeDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.LoanNotice;
import com.xj.ptgd.entity.out.LoanNoticeOut;
import com.xj.ptgd.service.LoanNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 放款通知推送中证
 *  @author cp
 * @date 2018/8/2
 */
@Service
public class LoanNoticeServiceImpl implements LoanNoticeService {
    @Autowired
    LoanNoticeDao loanNoticeDao;

    @Override
    public String findLoanNotice(){
        loanNoticeDao.findLoanNotice();
        return "";
    }

    @Override
    public String findById(String id) {
        // 合集出参
        LoanNoticeOut out = new LoanNoticeOut();
        // Head
        XMLHeadDto headDto = new XMLHeadDto();
        // Body
        LoanNotice loanNotice = null;
        loanNotice.setChannelCode("推送借据及还款信息");
        //loanNotice = loanNoticeDao.findById(id);
        // Head 、Body 放入
        out.setHead(headDto);
        out.setBody(loanNotice);
        // 转换成xml格式
        return ResultUtil.setHeadAndGetResult(headDto,out,LoanNoticeOut.class);
    }

    @Override
    public String sendPost() {
        String url = "http://192.168.99.19:8080/tochinacscs/post";
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
