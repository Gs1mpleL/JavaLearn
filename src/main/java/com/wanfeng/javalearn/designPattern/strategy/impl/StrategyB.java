package com.wanfeng.javalearn.designPattern.strategy.impl;

import org.springframework.stereotype.Component;

@Component
public class StrategyB extends AbstractStrategy {
    @Override
    public void doStrategy() {
        doPre();
        System.out.println("策略B执行");
        doAfter();
    }

    @Override
    public String getName() {
        return "B";
    }
}
