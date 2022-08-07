package com.wanfeng.javalearn.designPattern.observer;

public class ObserverA implements Observer{
    @Override
    public void update() {
        System.out.println("A get update");
    }
}
