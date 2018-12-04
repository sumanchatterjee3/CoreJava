package com.suman.HackerRank;

import java.util.Scanner;

public class checkIPAddressWithJavaRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}

    class myRegex{
        public myRegex() {
        }

        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    }
