package org.example;

public class Counter {


    private int value;

    public void inc() {
        value++;
    }

    public void dec() {
        value--;
    }

    public int getValue() {
        return value;
    }

    public String toString() {

        return "This is the current value 1 + 23" + value;
    }

    /*
    public static void main(String[] args) {


        System.out.println("Mikael4");
    }
    */
}