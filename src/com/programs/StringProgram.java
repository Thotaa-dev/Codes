package com.programs;

public class StringProgram {
    public static void main(String[] args) {
       reverse();
    }
    static void reverse(){
        String str="Thota";
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            rev= rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
