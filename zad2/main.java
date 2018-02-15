package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int h = 3;

        double triangle = a*(double)h/2;

        if (triangle>7) {
            System.out.println("Duzy trojkat");
        }
        else {
            System.out.println("Maly trojkat");
        }
    }
}
