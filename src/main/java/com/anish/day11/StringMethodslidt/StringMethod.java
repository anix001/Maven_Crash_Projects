package com.anish.day11.StringMethodslidt;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        //charAT
        System.out.println("charAt() method");
        String testString = "Java Extra Class Java";
        char result = testString.charAt(1);
        System.out.println(result);
        System.out.println("\n");

        //compareTo
        System.out.println("compareTo() method");
        String string1 = "Anish";
        String string2 = "Anish";
        String string3 = "Chaudhary";
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string3));
        System.out.println("\n");

        //concat
        System.out.println("concat() method");
        System.out.println(string1.concat(string3));
        System.out.println("\n");

        //contains
        System.out.println("contains() method");
        System.out.println(testString.contains("Java"));
        System.out.println(testString.contains("anish"));
        System.out.println("\n");

        //endsWith()
        System.out.println("endsWith() method");
        System.out.println(testString.endsWith("ss"));
        System.out.println(testString.endsWith("Java"));
        System.out.println("\n");

        //equals()
        System.out.println("equals() method");
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));
        System.out.println("\n");

        //indexOf()
        System.out.println("indexOf() method");
        System.out.println(testString.indexOf("Class"));
        System.out.println("\n");

        //isEmpty()
        System.out.println("isEmpty() method");
        String string4 = "";
        System.out.println(string1.isEmpty());
        System.out.println(string4.isEmpty());
        System.out.println("\n");

        //lastIndexOf()
        System.out.println("lastIndexOf() method");
        System.out.println(testString.lastIndexOf("Java"));
        System.out.println("\n");

        //length()
        System.out.println("lenght() method");
        System.out.println(testString.length());
        System.out.println("\n");

        //replace()
        System.out.println("replace() method");
        System.out.println(testString.replace("Java", "Python"));
        System.out.println("\n");

        //startsWith()
        System.out.println("startsWith() method");
        System.out.println(testString.startsWith("Java"));
        System.out.println("\n");

        //toLowerCase()
        System.out.println("toLowerCase() method");
        System.out.println(testString.toLowerCase());
        System.out.println("\n");

        //toUpperCase()
        System.out.println("toLowerCase() method");
        System.out.println(testString.toUpperCase());
        System.out.println("\n");


        //trim()
        System.out.println("trim() method");
        String string5 = "                   Hello World";
        System.out.println(string5);
        System.out.println(string5.trim());
        System.out.println("\n");


    }
}
