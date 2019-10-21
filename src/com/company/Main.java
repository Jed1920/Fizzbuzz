package com.company;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                if (x % 5 == 0) {
                    System.out.println("Fizzbuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}

