package com.suman.hackerrank;

import java.util.Scanner;

public class AbstractMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        AbstractBook book = new AbstractMyBook(title,author,price);
        book.dispaly();
    }
}
