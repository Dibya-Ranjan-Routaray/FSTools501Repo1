package com.nt.main;

import oracle.jdbc.driver.OracleDriver;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        OracleDriver driver=new OracleDriver();
        System.out.println("Driver Object hashcode::"+driver.hashCode());
    }
}
