package org.example;

public class Counter {


    private int value;


    public void inc() {
        value+=2;
    }

    public void dec() {
        value-=2;
    }

    public int getValue() {
        return value;
    }

    public String toString() {


        int p = 3;
        String s = "Hi";

        return "This is the current value 1 + 23"  + p + s + value;

    }

    // test push, and push,
    public int m1() {
        return 1+1;
    }

    /*
    public static void main(String[] args) {


        System.out.println("Mikael4");
    }
    */
}
