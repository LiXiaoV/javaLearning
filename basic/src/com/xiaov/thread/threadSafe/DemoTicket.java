package com.xiaov.thread.threadSafe;


public class DemoTicket {
    public static void main(String[] args) {
        RunnableImpl runnableImpl = new RunnableImpl();
//        RunnableImplSync runnableImpl = new RunnableImplSync();
//        RunnableImplSyncFunc runnableImpl = new RunnableImplSyncFunc();
//        RunnableImplSyncFuncStatic runnableImpl = new RunnableImplSyncFuncStatic();
//        RunnableImplSyncLock runnableImpl = new RunnableImplSyncLock();
        Thread xiaov = new Thread(runnableImpl, "xiaov");
        xiaov.start();

        Thread xiaoming = new Thread(runnableImpl, "xiaoming");
        xiaoming.start();

        Thread xiaohong = new Thread(runnableImpl, "xiaohong");
        xiaohong.start();
    }
}
