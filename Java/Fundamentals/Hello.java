package com.java.fundamentals.main;

public class Hello {

    public static void main(String[] args) {

        String username = args[0];
        if (!username.equals("")) {
            System.out.println("Hi, " + username + "!");
        } else {
            System.out.println("You didn't enter a username");
        }
    }
}