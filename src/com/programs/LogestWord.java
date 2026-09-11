package com.programs;

import java.util.Arrays;

public class LogestWord {
    public static void main(String[] args) {
        String str = "Ja2eeeeeeee3va programmingg is interesting";
        String[] result = str.split(" ");
        String longest=result[0];
        for (int i = 0; i < result.length; i++) {
            if(longest.length() <result[i].length())
                longest=result[i];
        }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
