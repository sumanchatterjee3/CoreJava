package com.suman.hackerrank;

public class NullObjectToString {

    public static String nullObjectToString(Object d){
        String dd = "";
        if(d == null || d.equals("")){
            dd = "null";
        }
        else{
            dd = d.toString().trim();
        }
        return dd;
    }

    public static void main(String[] args) {
        Object d ="";
        System.err.print(nullObjectToString(d));
    }
}
