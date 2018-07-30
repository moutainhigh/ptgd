package com.xj.ptgd.dao;

import com.xj.ptgd.entity.User;

import java.util.List;

 /**
  * UserDao 
  * @author wkm
  * @since 2018/7/30
  */
public interface UserDao {
    List<User> findUsers();
    User findUserForId(Integer userId);
}
