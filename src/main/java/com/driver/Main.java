package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.name = "Nandan";
        System.out.println(obj.name);
//        'name' has private access in com.driver.RWOnly

        obj.setName("Nandan");
        System.out.println(obj.getName());


    }
}