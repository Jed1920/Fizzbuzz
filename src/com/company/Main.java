package com.company;

public class Main {

    public static void main(String[] args) {

        for (int x = 1; x <= 106; x++) {
            String a = "";
            if (x % 3 == 0) {
                a += "Fizz";
            }
            if (x % 5 == 0) {
                a += "Buzz";
            }
            if (x % 7 == 0) {
                a += "Bang";
            }
            if (x % 11 == 0) {
                a = "Bong";
            }
            if (x % 13 == 0) {
                String b = "";
                b = "Fezz";

            }
            if (a.isEmpty()) {
                a += x;
            }
            System.out.println(a);
        }
    }
}
