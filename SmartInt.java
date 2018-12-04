package com.suman.HackerRank;

public class SmartInt {
    public int value;
    public static void main(String[] args) {
        SmartInt smartInt = new SmartInt(345);
        String stringHolder = smartInt.toString();
        System.out.println(stringHolder);

        smartInt.setValue(12345);
        stringHolder = smartInt.toString();
        System.out.println(stringHolder);
    }

    public SmartInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        String str = String.valueOf(this.value);
        return str;
    }
}
