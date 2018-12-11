package com.suman.hackerrank;

class AbstractMyBook extends AbstractBook {
    int Price;

    public AbstractMyBook(String title, String author, int price) {
        super(title, author);
        this.Price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+this.Price);
    }
}
