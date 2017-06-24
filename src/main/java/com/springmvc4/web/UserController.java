package com.springmvc4.web;

import com.springmvc4.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Gracecoder on 2017/6/22.
 */

@Controller
public class UserController {

    //因为只有一个实现类，多个实现类可以用 @Qualifier("") 区分

    @Autowired
    private IUserService userService;

    @RequestMapping("/say")
    public String say(HttpServletRequest request, Model model)
    {

        request.setAttribute("use",userService.say());
        request.setAttribute("msg",userService.say());

        model.addAttribute("name","limingwei");

        return "index";
    }

}
