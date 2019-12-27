package com.zhc.listener;

import com.zhc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //获得servletContext对象
        ServletContext servletContext = sce.getServletContext();
        //读取web.xml中配置的配置文件
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        System.out.println(contextConfigLocation);

        //创建spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("applicationContext",applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
