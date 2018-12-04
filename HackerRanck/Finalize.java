package com.suman.HackerRank;

public class Finalize {
    private int x;
    public Finalize(int x){
        this.x = x;
    }

    public void finalize(){
        System.out.println("Finalizing "+this.x);
    }

    public static void main(String[] args) {
        for(int i=0;i<20000;i++){
            new Finalize(i);
        }
    }
}
