package com.suman.HackerRank;

import java.util.Scanner;

public class AddressLineLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number of Address Lines");
        int noOfLines = scanner.nextInt();
        try {
            if (noOfLines <= 3) {
                String address = new String();
                for (int i = 0; i <= noOfLines - 1; i++) {
                    scanner.nextLine();
                    address = scanner.nextLine();
                    //System.out.println(address);
                    count++;
                    formatAddress(address, count);
                }

            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException IllegalArgumentException) {
            IllegalArgumentException.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
            ArrayIndexOutOfBoundsException.printStackTrace();
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
                        //System.out.println(pointer1);
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
                   /* for(char v:Line1){
                        System.out.print(Line1[v]);
                    }*/

                   /* for(char v:Line2){
                        System.out.print(Line2[v]);
                    }
                    for(char v:Line3){
                        System.out.print(Line2[v]);
                    }*/
                }
                System.out.println();
                for (int v=0;v<=Line1.length-1;v++){
                    System.out.print(Line1[v]);
                }
                System.out.println();
                for (int v=0;v<=Line2.length-1;v++){
                    System.out.print(Line2[v]);
                }
                System.out.println();
                for(int v=0;v<=Line3.length-1;v++){
                    System.out.print(Line3[v]);
                }
                break;
            case 2:
                if (true) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (true) {
                    break;
                } else {
                    break;
                }
        }


    }
}
