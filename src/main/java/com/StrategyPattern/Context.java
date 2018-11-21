package com.StrategyPattern;

public class Context {

    private IStrategy strategy;
    //构造函数，你要使用那个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.strategy.operate();
    }
}
