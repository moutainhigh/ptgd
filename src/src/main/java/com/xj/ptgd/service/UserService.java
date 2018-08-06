package com.xj.ptgd.service;


import com.xj.ptgd.entity.body.User;

import java.util.List;

 /**
  * UserService 
  * @author wkm
  * @since 2018/7/30
  */
public interface UserService {
    String findUsers();
    String findUserById(Integer userId);

    /*发送报文请求*/
    String sendPost();
}
