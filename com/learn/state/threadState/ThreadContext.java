package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: ThreadContext
 * @Description:上下文
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:47
 * @Version: V1.0
 */
public class ThreadContext {
    private ThreadState state;

    ThreadContext() {
        state = new NewState();
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public ThreadState getState() {
        return state;
    }

    public void start() {
        if(state instanceof NewState){
             ((NewState) state).start(this);
        }else{
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }

    public void getCPU() {
        if(state instanceof RunnableState){
            ((RunnableState) state).getCPU(this);
        }else{
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }

    public void suspend() {
        if(state instanceof RunningState){
            ((RunningState) state).suspend(this);
        }else{
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }

    public void resume() {
        if(state instanceof BlockedState){
            ((BlockedState) state).resume(this);
        }else{
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }

    public void stop() {
        if(state instanceof RunningState){
            ((RunningState) state).stop(this);
        }else{
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }
}
