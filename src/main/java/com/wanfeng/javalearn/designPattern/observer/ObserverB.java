package com.wanfeng.javalearn.designPattern.observer;

public class ObserverB implements Observer{
    @Override
    public void update() {
        System.out.println("B get update");
    }
}
