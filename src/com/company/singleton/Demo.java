package com.company.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("123");
        Singleton singleton2 = Singleton.getInstance("qwe");

        System.out.println("singleton1: " + singleton1.value);
        System.out.println("singleton2: " + singleton2.value);
    }
}
