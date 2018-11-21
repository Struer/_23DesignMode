package com.StrategyPattern;

import com.StrategyPattern.impl.BlockEnemy;
import com.StrategyPattern.impl.BookDoor;
import com.StrategyPattern.impl.GivenGreenLight;

public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        context = new Context(new BookDoor());
        context.operate();

        context = new Context(new GivenGreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();
        /*
        *问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊，
        *而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了
        *
        * 错！ BackDoor、 GivenGreenLight、 BlockEnemy只是一个代码，你写成first、 second、
        third，没人会说你错!
        *
        * 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
        */
    }

}
