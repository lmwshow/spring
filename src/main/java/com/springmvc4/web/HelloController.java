package com.springmvc4.web;

import com.springmvc4.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Gracecoder on 2017/6/13.
 */


@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(HttpServletRequest request, Model model)
    {

        User user =new User();
        user.setId(1);
        user.setUsername("asd");
        user.setPassword("132");

        model.addAttribute(user);

        return "index";
    }

    @RequestMapping("/login")
    public String toLogin()
    {
        return "login";
    }
}
