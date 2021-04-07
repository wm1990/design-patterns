package com.learn.mediator.qqChat;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.qqChat
 * @ClassName: User
 * @Description:同事类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:41
 * @Version: V1.0
 */
public class User {
    private String name;
    private QqServer server;

    public User(String name){
        this.name = name;
    }

    public void setServer(QqServer server){
        this.server = server;
    }

    public String getName(){
        return name;
    }

    public void sendMsg(String msg){
        server.relay(this,msg);
    }

    public void receive(String name,String msg) {
        System.out.println(name+"："+msg);
    }
}
