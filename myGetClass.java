package com.suman.HackerRank

public class myGetClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Class<Cat> catClass = (Class<Cat>)cat.getClass();
        String fullName = catClass.getName();
        String simpleName = catClass.getSimpleName();
        System.out.println("Full Name : "+fullName + "\n"+"Simple Name : "+simpleName);
    }

    public static class Cat{}
}

//Create a simple cat call below that is called in the main class


