package com.learn.simpleFactory;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.simpleFactory
 * @ClassName: SimpleFactory
 * @Description:工厂类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 10:08
 * @Version: V1.0
 */
public class SimpleFactory {
    public static Tea makeTea(int type){
        if(type == 1){
            return new RedTea();
        }else if(type ==2){
            return new GreenTea();
        }else{
            System.out.println("制作失败！！！");
            return null;
        }
    }
}
