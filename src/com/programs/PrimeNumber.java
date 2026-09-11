package com.programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 170;
        isPrime1(n);
        isPrime2(n);
    }

    static void isPrime1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 2)
                System.out.println("Prime muber");
            else
                System.out.println("Not a prime number");
        }

    }

    //    2 t0 n    count ==1
    static void isPrime2(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 1)
                System.out.println("Prime muber");
            else
                System.out.println("Not a prime number");
        }

    }

    //    2 to n-1 count ==0
    static boolean isPrime3(int n) {
        int count = 0;
        boolean res = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 0)
                res = true;
            else
                res = false;
        }
        return res;

    }

    //   2 to n/2  count ==0
    static void isPrime4(int n) {
        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 1)
                System.out.println("Prime muber");
            else
                System.out.println("Not a prime number");
        }

    }

    //    2 to math.sqrt(n)
    static void isPrime5(int n) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == 0)
                System.out.println("Prime muber");
            else
                System.out.println("Not a prime number");
        }

    }

}
