//package com.springmvc4;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
///**
// * Created by Gracecoder on 2017/6/13.
// * @EnableWebMvc会开启一些默认配置，如一些ViewResolver或者MessageConverter等
// */
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.springmvc4")
//public class MyMvcConfig {
//
//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//
//        viewResolver.setPrefix("/WEB-INF/classes/views/");
//        //运行时和开发时不一样，运行时代码会将我们的页面自动编译到/WEB-INF/classes/views/下
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setViewClass(JstlView.class);
//        return viewResolver;
//    }
//}
