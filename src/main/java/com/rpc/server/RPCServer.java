package com.rpc.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hubo on 2015/12/23
 */
public class RPCServer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

}
