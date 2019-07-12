package testApi;


import service.impl.HelloWordServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;
//使用Servlet3.0提供的@WebListener注解将实现了ServletContextListener接口的WebServicePublishListener类标注为一个Listener
//这里要注意，1，发布服务的port和web服务的port不能一样，否则会报错。2，spring boot项目需要通过properties-》project facets
//设置jax-rs（REST web serviec）和dynamic web module.否则可能不能调用接口
@WebListener
public class WebServicePublishListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    // TODO Auto-generated method stub

    }


    @Override
    public void contextInitialized(ServletContextEvent arg0) {
    // TODO Auto-generated method stub
    //WebService的发布地址
    String address = "http://127.0.0.1:8080/hubo/WebService";
    //发布WebService，WebServiceImpl类是WebServie接口的具体实现类
    Endpoint.publish(address , new HelloWordServiceImpl());
    System.out.println("使用WebServicePublishListener发布webservice成功!");
    }

}
