package com.test;

public class US_001 {

    public static void main(String[] args) {

        int age = 44;
        String firstName = "Murat";
        String lastName = "Guney";

        System.out.println("First Name = " + firstName+"\nLast Name = "+lastName+"\nAge = "+age);

        for (int i = firstName.length()-1; i >= 0 ; i--) {
            char ch = firstName.charAt(i);
            System.out.print(ch);
        }


    }
}
