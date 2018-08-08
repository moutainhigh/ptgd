package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.exception.DataNullException;
import com.xj.ptgd.common.httpXml.HttpClientXMLUtil;
import com.xj.ptgd.common.result.ResultUtil;
import com.xj.ptgd.dao.UserDao;
import com.xj.ptgd.entity.out.UserListXMlOut;
import com.xj.ptgd.entity.out.UserXMlOut;
import com.xj.ptgd.entity.base.XMLHeadDto;
import com.xj.ptgd.entity.body.User;
import com.xj.ptgd.entity.body.UserList;
import com.xj.ptgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * UserServiceImpl 
  * @author wkm
  * @since 2018/7/30
  */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public String findUsers(){
        UserListXMlOut ret = new UserListXMlOut();
        XMLHeadDto head = new XMLHeadDto();
        UserList userList = new UserList();
        userList.setFrame(userDao.findUsers());
        ret.setBody(userList);
        return ResultUtil.setHeadAndGetResult(head,ret,UserListXMlOut.class);
    }

    @Override
    public String findUserById(Integer userId){
        UserXMlOut ret = new UserXMlOut();
        XMLHeadDto head = new XMLHeadDto();

        User user = userDao.findUserForId(userId);
        if(user == null){ //数据为空处理
            throw new DataNullException();
        }else{
            ret.setHead(head);
            ret.setBody(user);
            return ResultUtil.getResult(ret,UserXMlOut.class);
        }
    }

    @Override
    public String sendPost() {
        String url = "http://192.168.99.17:8080/user/post";
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
                "       <errorCode>万科</errorCode>" +
                "       <errorMessage></errorMessage>" +
                "       <errorDetail></errorDetail>" +
                "   </tout>" +
                "</out>32E5677A7BF5B546";
        return tmi.post(url,resXML);
    }
}
