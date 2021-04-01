package com.learn.builder;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.builder
 * @ClassName: Computer
 * @Description:产品角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:57
 * @Version: V1.0
 */
public class Computer {
    private String inDevice;

    private String controller;

    private String operator;

    private String memorizor;

    private String outDevice;

    public String getInDevice() {
        return inDevice;
    }

    public void setInDevice(String inDevice) {
        this.inDevice = inDevice;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getMemorizor() {
        return memorizor;
    }

    public void setMemorizor(String memorizor) {
        this.memorizor = memorizor;
    }

    public String getOutDevice() {
        return outDevice;
    }

    public void setOutDevice(String outDevice) {
        this.outDevice = outDevice;
    }

    public void show() {
        System.out.println("联想电脑组装完成。");
    }
}
