package com.springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gracecoder on 2017/6/13.
 */


@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello()
    {
        return "index";
    }

    @RequestMapping("/login")
    public String toLogin()
    {
        return "login";
    }
}
