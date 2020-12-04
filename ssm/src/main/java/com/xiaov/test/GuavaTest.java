package com.xiaov.test;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2020-11-09 10:34 上午
 */
public class GuavaTest {
    @Test
    public void test(){
        final RateLimiter rateLimiter = RateLimiter.create(1);

        for (int i = 0; i < 10; i++) {
            long timeOut = (long) 0.5;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean isValid = rateLimiter.tryAcquire(timeOut, TimeUnit.SECONDS);
            System.out.println("任务" + i+"执行是否有效："+isValid);
            if(!isValid){
                continue;
            }
            System.out.println("任务" + i+"在执行");
        }
        System.out.println("结束");

    }
}
