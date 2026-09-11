package com.programs;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num=3;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum is " + sum);
    }

}
