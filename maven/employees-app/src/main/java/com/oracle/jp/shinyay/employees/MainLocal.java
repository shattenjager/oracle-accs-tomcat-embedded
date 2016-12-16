package com.oracle.jp.shinyay.employees;

import org.apache.catalina.startup.Tomcat;

import java.util.Optional;

/**
 * Created by syanagih on 2016/12/15.
 */
public class MainLocal {

    public static void main(String[] args) throws Exception {
        String contextPath = "/";
        String appBase = ".";
        String path = "8080";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.valueOf(path));
        tomcat.getHost().setAppBase(appBase);
        tomcat.addWebapp(contextPath, appBase);
        tomcat.start();
        tomcat.getServer().await();
    }
}
