package com.springmvc4.service.serviceImpl;

import com.springmvc4.Dao.UserDao;
import com.springmvc4.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gracecoder on 2017/6/24.
 */

@Service("UserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String say()
    {
        return String.valueOf(userDao.findById(1));
    }

}
