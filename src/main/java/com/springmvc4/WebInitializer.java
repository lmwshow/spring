//package com.springmvc4;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration.Dynamic;
//
///**
// * Created by Gracecoder on 2017/6/13.
// */
//
//public class WebInitializer implements WebApplicationInitializer {
//    //实现WebApplicationInitializer，达到替代web.xml的目的
//
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//        System.out.println("gogo");
//
//
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(MyMvcConfig.class);
//        ctx.setServletContext(servletContext);
//
//        Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);
//
//
//    }
//}
