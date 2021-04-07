package com.learn.templateMethod.bankBusiness;

import java.util.Random;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.bankBusiness
 * @ClassName: AbstractBusiness
 * @Description:抽象类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:32
 * @Version: V1.0
 */
public abstract class AbstractBusiness {
    private int number;

    public final void doBusinessTemplate(){
        //取号
        getNumber();
        //前面有人就要排队
        if(havePerson()){
            lineUp();
        }
        //办业务
        doBusiness();
        //评价
        evaluate();
    }

    private void getNumber() {
        Random random = new Random();
        number = random.nextInt(5);
        if(number>1){
            System.out.println("你是"+number+"号，前面有"+(number-1)+"人！");
        }else{
            System.out.println("你是"+number+"号，请直接去办理业务！");
        }
    }

    private boolean havePerson() {
        if(number<2){
            return false;
        }
        return true;
    }

    private void lineUp(){
        System.out.println("前面有"+(number-1)+"人，请耐心等待！");
    }

    protected abstract void doBusiness();

    protected abstract void evaluate();
}
