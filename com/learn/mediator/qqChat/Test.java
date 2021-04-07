package com.learn.mediator.qqChat;

import java.util.Timer;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.qqChat
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:52
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        QqServer server = new QqServer();

        User zhangsan = new User("张三");
        User lisi = new User("李四");

        server.register(zhangsan);
        server.register(lisi);

        zhangsan.sendMsg("李四你好！");
        System.out.println("=============================");
        lisi.sendMsg("张三你好！");
    }
}
