package com.wuroc.javatest;

/**
 * @ClassName hu
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-08-04 17:05
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();

        new Thread(() -> {
            for (char i = 'A'; i <= 'Z'; i++) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "======== " + i);
                    condition2.signal(); // 唤醒thread-1
                    condition1.await(); // 让thread-A处于等待状态
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "thread-A").start();

        new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "======== " + i);
                    condition3.signal(); // 唤醒thread-
                    condition2.await(); // 让thread-1处于等待状态
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "thread-1").start();

        new Thread(() -> {
            for (char i = 'a'; i <= 'z'; i++) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "======== " + i);
                    condition1.signal(); // 唤醒thread-A
                    condition3.await(); // 让thread-a处于等待状态
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "thread-a").start();
    }
}

