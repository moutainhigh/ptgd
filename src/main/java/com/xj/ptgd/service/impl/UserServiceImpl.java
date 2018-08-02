package com.xj.ptgd.service.impl;

import com.xj.ptgd.common.exception.DataNullException;
import com.xj.ptgd.common.result.ResultEnum;
import com.xj.ptgd.dao.UserDao;
import com.xj.ptgd.entity.body.User;
import com.xj.ptgd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

 /**
  * UserServiceImpl 
  * @author wkm
  * @since 2018/7/30
  */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findUsers(){
        return userDao.findUsers();
    }

    @Override
    public User findUserById(Integer userId){
        User user = userDao.findUserForId(userId);
        if(user == null){ //数据为空处理
            throw new DataNullException(ResultEnum.DATA_NULL);
        }else{
            return user;
        }
    }
}
