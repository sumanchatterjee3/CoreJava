package com.suman.hackerrank;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class CheckIPAddressWithJavaRegex {
    private static final Logger logger = Logger.getLogger(CheckIPAddressWithJavaRegex.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String IP = scanner.next();
            logger.info(IP.matches(new myRegex().pattern));
        }
    }
}

class myRegex {
    private String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

    myRegex() {
    }
}
