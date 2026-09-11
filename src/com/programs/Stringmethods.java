package com.programs;

public class Stringmethods {
   public static void main(String[] args) {
       String a = "Thota Mahender";
       System.out.println(a.length());
       System.out.println(a.replace('a','f'));
       System.out.println(a.replaceFirst("M","Q"));
       System.out.println("length " + a.length());
       System.out.println("Char Positon " + a.charAt(3));
       System.out.println("concat with M " + a.concat("M"));
       System.out.println("equals " + a.equals("thota"));
       System.out.println("equalsingonrecase " + a.equalsIgnoreCase(" m thota"));
       System.out.println("indexOF " + a.indexOf('o'));
       System.out.println("lastindex of " + a.lastIndexOf(a));
       System.out.println("Contains " + a.contains("Thot"));
       System.out.println("Startwith " + a.startsWith("Th"));
       System.out.println("ends with " + a.endsWith("a"));
       System.out.println("Trim " + a.trim());
       System.out.println("upper case " + a.toUpperCase());
       System.out.println("lowercase0 " + a.toLowerCase());
       System.out.println("Isempty " + a.isEmpty());
       System.out.println("Isblank " + a.isBlank());
   }

}
