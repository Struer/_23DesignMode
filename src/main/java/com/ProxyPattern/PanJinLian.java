package com.ProxyPattern;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定一个潘金莲是什么样的人
 */
public class PanJinLian implements KindWomen {

    @Override
    public void makeEyeWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }
}
