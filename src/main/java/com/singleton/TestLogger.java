package com.singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        System.out.println(logger.hashCode());

        //get the same object
        Logger logger2 = Logger.getInstance();
        System.out.println(logger.hashCode());
    }
}
