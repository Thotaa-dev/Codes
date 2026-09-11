package com.programs;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int f=1;
        for (int i = n; i >=1 ; i--) {
            f=f*i;
        }
        System.out.println("Factorial of n is:- "+f);
    }
}
