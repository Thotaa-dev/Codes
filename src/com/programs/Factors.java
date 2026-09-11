package com.programs;

public class Factors {
    public static void main(String[] args) {
        int n=8;
        System.out.println("Factors of n is:");
        for (int i = 1; i <=n ; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
    }
}
