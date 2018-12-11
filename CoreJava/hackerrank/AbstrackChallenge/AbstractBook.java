package com.suman.hackerrank;

abstract class AbstractBook {
    String title;
    String author;

    public AbstractBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
