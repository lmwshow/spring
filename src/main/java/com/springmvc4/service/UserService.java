package com.springmvc4.service;

import com.springmvc4.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gracecoder on 2017/6/22.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String say()
    {
//        return userDao.say();
        return "say";
    }
}
