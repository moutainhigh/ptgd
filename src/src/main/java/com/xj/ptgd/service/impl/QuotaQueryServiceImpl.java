package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.QuotaQueryDao;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.QuotaQuery;
import com.xj.ptgd.entity.body.QuotaQueryList;
import com.xj.ptgd.entity.out.QuotaQueryListOut;
import com.xj.ptgd.entity.out.QuotaQueryOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 推送客户额度信息
 * @author cp
 * @date 2018/8/2
 */
@Service
public class QuotaQueryServiceImpl implements com.xj.ptgd.service.QuotaQueryService {
    @Autowired
    QuotaQueryDao quotaQueryDao;

    @Override
    public String findQuotaQuery(){
        // 合集出参
        QuotaQueryListOut out = new QuotaQueryListOut();
        // Head
        XMLHeadDto headDto = new XMLHeadDto();
        // Body
        QuotaQueryList quotaQueryList = new QuotaQueryList();
        // 放入Body
        QuotaQuery quotaQuery = new QuotaQuery();
        quotaQuery.setChannelCode("1111111");
        quotaQuery.setCustomerCode("222");
        quotaQuery.setCustomerName("333");
        QuotaQuery q = new QuotaQuery();
        q.setChannelCode("1");
        q.setCustomerCode("2");
        q.setCustomerName("3");
        List<QuotaQuery> list = new ArrayList<>();
        list.add(quotaQuery);
        list.add(q);
        quotaQueryList.setFrame(list);
        //quotaQueryList.setFrame(quotaQueryDao.findQuotaQuery());
        // Head 、Body 放入
        headDto.setChnNo("ceshi");
        out.setHead(headDto);
        out.setBody(quotaQueryList);
        // 转换成xml格式
        return ResultUtil.setHeadAndGetResult(headDto,out,QuotaQueryListOut.class);
    }

    @Override
    public String findByName(String name){
        // 合集出参
        QuotaQueryOut out = new QuotaQueryOut();
        // Head
        XMLHeadDto headDto = new XMLHeadDto();
        // Body
        QuotaQuery quotaQuery = new QuotaQuery();
        quotaQuery.setChannelCode("111");
        quotaQuery.setCustomerCode("222");
        quotaQuery.setCustomerName("333");
        //quotaQuery = quotaQueryDao.findById(name);
        // Head 、Body 放入
        headDto.setChnNo("ceshi");
        out.setHead(headDto);
        out.setBody(quotaQuery);
        // 转换成xml格式
        return ResultUtil.setHeadAndGetResult(headDto,out,QuotaQueryListOut.class);
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
