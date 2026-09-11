package com.programs;

public class AddationalProgram {
    public static void main(String[] args) {
        int n = 1234;
        count(n);
        sum(n);
        reverse(n);
    }

    static void count(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    static void sum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    static void reverse(int n){
        String rev="";
        while (n!=0){
            int rem= n%10;
            rev=rev+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
