package com.suman.hackerrank;

import org.apache.log4j.Logger;

public class MyGetClass {
    private static final Logger logger = Logger.getLogger(MyGetClass.class);
    public static void main(String[] args) {
        Cat cat = new Cat();
        Class<Cat> catClass = (Class<Cat>)cat.getClass();
        String fullName = catClass.getName();
        String simpleName = catClass.getSimpleName();
        logger.info("Full Name : "+fullName + "\n"+"Simple Name : "+simpleName);
    }

    public static class Cat{}
}

//Create a simple cat call below that is called in the main class


