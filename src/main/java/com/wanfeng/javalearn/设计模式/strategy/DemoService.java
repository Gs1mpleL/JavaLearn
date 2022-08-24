package com.wanfeng.javalearn.设计模式.strategy;

import com.wanfeng.javalearn.设计模式.strategy.impl.StrategyA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private  StrategyMap strategyMap;

    public IStrategy getStrategy(String a){
        if (strategyMap.strategyHashMap.get(a) == null) {
            System.out.println("执行默认策略");
            return new StrategyA();
        }

        return strategyMap.strategyHashMap.get(a);
    }

}
