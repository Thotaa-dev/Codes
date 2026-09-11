package com.programs;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = {2,34,54,12,122};
        reverse(arr);
        reverse2(arr);
    }
    static void reverse(int[] arr){
        int[] revarr=new int[arr.length];
        int j=0;
        for (int i = revarr.length-1; i >=0; i--) {
            revarr[j]= arr[i];
            j++;
        }
        System.out.println(Arrays.toString(revarr));
    }
    static void reverse2(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
