package com.suman.hackerrank;

public class ObjectToString {
    public static void main(String[] args) {
        Object array = "SumanChatterjee";
        String s = String.valueOf(array);
        System.err.print(s);
    }
/*
    public static String toString(Object array){
        int length = Array.getLength(array);
        if(length == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0;;i++){
            builder.append(Array.get(array,i));
            if(i == length-1){
                builder.append("]");
            }
            builder.append(",");
        }
    }*/
}
