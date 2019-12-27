package com.zhc.web;

import com.zhc.service.UserService;
import com.zhc.service.impl.UserServiceImpl;
import com.zhc.util.WebApplicationContextUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = WebApplicationContextUtils.getApplicationContext(this.getServletContext());
        UserService userService = applicationContext.getBean(UserServiceImpl.class);
        userService.show();
    }
}
