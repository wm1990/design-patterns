package com.learn.mediator.qqChat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.qqChat
 * @ClassName: QqServer
 * @Description:中介者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:39
 * @Version: V1.0
 */
public class QqServer {
    private List<User> users = new ArrayList<>();

    //注册
    public void register(User user){
        if(!users.contains(user)) {
            users.add(user);
            user.setServer(this);
        }
    }
    //转发
    public void relay(User user,String msg){
        for (User receiver : users) {
            if (!receiver.equals(user)) {
                receiver.receive(user.getName(),msg);
            }
        }
    }
}
