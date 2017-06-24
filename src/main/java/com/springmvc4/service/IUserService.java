package com.springmvc4.service;

import com.springmvc4.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Gracecoder on 2017/6/22.
 */

public interface IUserService {

    public String say();
}
