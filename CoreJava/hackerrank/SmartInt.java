package com.suman.hackerrank;

public class SmartInt {
    private int value;
    public static void main(String[] args) {
        SmartInt smartInt = new SmartInt(345);
        String stringHolder = smartInt.toString();
        System.err.print(stringHolder);

        smartInt.setValue(12345);
        stringHolder = smartInt.toString();
        System.err.print(stringHolder);
    }

    private SmartInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        String str = String.valueOf(this.value);
        return str;
    }
}
