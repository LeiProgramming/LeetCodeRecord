package com.peter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DemoAQS {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("A is coming!");
                try {
                    TimeUnit.MINUTES.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } finally {
                lock.unlock();
            }
        }, "A").start();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("B is coming!");
            } finally {
                lock.unlock();
            }
        }, "B").start();

        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("C is coming!");
            } finally {
                lock.unlock();
            }
        }, "c").start();
    }
}
