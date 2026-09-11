package com.programs;

public class MinAndmaxArray {
    public static void main(String[] args) {
        int[] arr = {2,34,54,12,122};
        min(arr);
        max(arr);
    }
    static void min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i])
                min=arr[i];
        }
        System.out.println("Min value is " + min);
    }
    static void max(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        System.out.println("Max value is " + max);
    }
}
