package com.springmvc4.Dao;

import com.springmvc4.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Gracecoder on 2017/6/23.
 */

public interface UserDao {


    User findById(int i);
}
