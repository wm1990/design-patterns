package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: ResultMsg
 * @Description:登录返回结果
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:02
 * @Version: V1.0
 */
public class ResultMsg {
    private int code;
    private String msg;

    public ResultMsg(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


















