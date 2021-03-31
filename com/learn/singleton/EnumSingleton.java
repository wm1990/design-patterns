package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: EnumSingleton
 * @Description:枚举式单例
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:27
 * @Version: V1.0
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
