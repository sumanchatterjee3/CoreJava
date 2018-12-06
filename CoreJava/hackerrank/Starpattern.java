package com.suman.hackerrank;

public class Starpattern {
    public static void main(String[] args) {
        int i,j,k;
        int counter =0;
        for(i=5;i>0;i--){
            //System.err.print("Line Nummber "+i);
            counter=i;
            for(j=1;j<i;j++){
                System.err.print("////");
            }
            while(counter !=5){
                //System.out.print(+counter);
                for(k=4;((k>0)&&(k>(i-1)));k--){
                    System.err.print("********");
                    counter++;
                }
            }
            for(j=1;j<i;j++){
                System.err.print("\\\\\\\\");
            }
            System.err.print("\n");
        }
    }
}

