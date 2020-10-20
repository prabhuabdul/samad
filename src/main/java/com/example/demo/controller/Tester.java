package com.example.demo.controller;

public class Tester {
    public static void main(String[] args) {
        String str = "";
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse "+reverse);
    }

}



