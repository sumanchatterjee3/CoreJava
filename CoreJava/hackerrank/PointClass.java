package com.suman.hackerrank;

public class PointClass {
    protected int x;
    protected int y;

    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        PointClass PC = new PointClass(34, 85);
        String Coordinates = PC.toString();
        System.err.print("The Co-Ordinates are : " + Coordinates);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        String xAxis = String.valueOf(this.x);
        String yAxis = String.valueOf(this.y);
        String Coordinates = xAxis + "," + yAxis;
        return Coordinates;
    }
}
