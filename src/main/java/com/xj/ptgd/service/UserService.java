package com.xj.ptgd.service;


import com.xj.ptgd.entity.User;

import java.util.List;

 /**
  * UserService 
  * @author wkm
  * @since 2018/7/30
  */
public interface UserService {
    List<User> findUsers();
    User findUserById(Integer userId);
}
