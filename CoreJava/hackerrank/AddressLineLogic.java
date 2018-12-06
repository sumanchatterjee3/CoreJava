package com.suman.hackerrank;

import java.util.Scanner;

public class AddressLineLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int noOfLines = scanner.nextInt();
        try {
            if (noOfLines <= 3) {
                String address;
                for (int i = 0; i <= noOfLines - 1; i++) {
                    scanner.nextLine();
                    address = scanner.nextLine();
                    count++;
                    formatAddress(address, count);
                }

            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException illegalargumentexception) {
            System.console().writer().print(illegalargumentexception);
        } catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
            System.console().writer().print(arrayindexoutofboundsexception);
        }

    }

    static void formatAddress(String address, int count) {
        String Address = address;
        int pointer1 = 0;
        int pointer2 = 0;
        int pointer3 = 0;
        int counter = count;
        //System.out.println(counter);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        char[] addr = Address.toCharArray();
        char[] Line1 = new char[100];
        char[] Line2 = new char[100];
        char[] Line3 = new char[100];
        switch (counter) {
            case 1:
                for (int i = 0; i <= addr.length - 1; i++) {
                    if ((i >= 0 && i < 100) && (!flag1)) {
                        Line1[i] = Address.charAt(i);
                        pointer1 = i;

                        if (i == 100){
                            flag1=true;
                        }
                    } else if ((i >= 100 && i < 200) && (!flag2)) {
                        Line2[(i - 100)] = Address.charAt(i);
                        pointer2 = (i - 100);
                        if (i == 199){
                            flag2=true;
                        }
                            //flag2 = true;
                    } else if ((i >= 200 && i < 300) && (!flag3)) {
                        Line3[i - 200] = Address.charAt(i);
                        pointer3 = (i - 200);
                        if (i == 299) {
                            flag3 = true;
                        }
                    }

                }
                System.console().writer().print("\n");
                for (int v=0;v<=Line1.length-1;v++){
                    System.console().writer().print((Line1[v]));
                }
                System.out.println();
                for (int v=0;v<=Line2.length-1;v++){
                    System.console().writer().print((Line2[v]));
                }
                System.console().writer().print("\n");
                for(int v=0;v<=Line3.length-1;v++){
                    System.console().writer().print((Line3[v]));
                }
                break;

        }


    }
}
