package com.java.fundamentals4;

public class SumAndMultiplication {

    public static void main(String[] args) {

        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }

        System.out.println(sum);

        int multiplication = 1;

        for (String arg : args) {
            multiplication *= Integer.parseInt(arg);
        }

        System.out.println(multiplication);

    }
}