package com.wanfeng.javalearn.designPattern.strategy.impl;

import org.springframework.stereotype.Component;

@Component
public class StrategyA extends AbstractStrategy {
    @Override
    public void doStrategy() {
        doPre();
        System.out.println("策略A执行");
        doAfter();
    }

    @Override
    public String getName() {
        return "A";
    }


}
