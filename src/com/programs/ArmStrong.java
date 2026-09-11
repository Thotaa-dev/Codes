package com.programs;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int count=0;
        int temp =n;

        while (temp!=0){
            temp=temp/10;
            count++;
        }
        System.out.println("Count " + count);

        int sum=0;
        while (n!=0){
            int res = n%10;
            sum=(int)Math.pow(res,count)+sum;
            n=n/10;
        }
        System.out.println(sum);

        if (sum==original)
            System.out.println("Armstrong");
        else
            System.out.println("not Armstrong");
    }
}
