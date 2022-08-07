package com.wanfeng.javalearn.designPattern.strategy.impl;

import com.wanfeng.javalearn.designPattern.strategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * 策略公用操作
 */
public abstract class AbstractStrategy implements IStrategy {
    protected void doPre(){
        System.out.println("公用前置操作.....");
    }

    protected void doAfter(){
        System.out.println("公用后置操作.....");
    }
}
