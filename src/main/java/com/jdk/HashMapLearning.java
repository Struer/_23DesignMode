package com.jdk;

public class HashMapLearning {

    static int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        System.out.println(MAXIMUM_CAPACITY);
        int i = tableSizeFor(3);
        System.out.println(i);
    }

    static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
