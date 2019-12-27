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

        ServletContext servletContext = sce.getServletContext();
        //读取web.xml中的配置
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("applicationContext",applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
