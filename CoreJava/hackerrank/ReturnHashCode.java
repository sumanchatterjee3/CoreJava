package com.suman.hackerrank;

import org.apache.log4j.Logger;

public class ReturnHashCode {
    private static final Logger logger = Logger.getLogger(ReturnHashCode.class);
    public static void main(String[] args) {
        String s = "suman";
        String t = "suma";
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        if(s.equals(t)){
            logger.info("True");
        }
        else{
            logger.info("False");
        }
    }
}
