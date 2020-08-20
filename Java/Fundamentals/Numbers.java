package com.java.fundamentalsOptionals1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Какое количество чисел Вы введёте? - ");
        int n = Integer.parseInt(bufferedReader.readLine());

        int[] lengths = new int[n];
        int[] numbers = new int[n];

        System.out.println("Вводите числа:");

        for (int i = 0; i < n; i++) {

            String string = bufferedReader.readLine();
            numbers[i] = Integer.parseInt(string);
            lengths[i] = string.length();
        }

        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;

        for (int length : lengths) {

            if (length > maxLength) {
                maxLength = length;
            }

            if (length < minLength) {
                minLength = length;
            }
        }

        bufferedReader.close();

        System.out.println("Самое короткое число длинной - " + minLength + " : ");

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] == minLength) {
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.print("\b\b\n");

        System.out.println("Самое длинное число длинной - " + maxLength + " : ");

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] == maxLength) {
                System.out.print(numbers[i] + ", ");
            }
        }

        System.out.print("\b\b\n");

        System.out.println("Числа с длинной меньше средней длины (число - длина):");

        int avrgLength = (maxLength + minLength) / 2;

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] <= avrgLength) {
                System.out.print(numbers[i] + " - " + lengths[i] + ", ");
            }
        }

        System.out.print("\b\b\n");

        System.out.println("Числа с длинной больше средней длины (число - длина):");

        for (int i = 0; i < lengths.length; i++) {
            if (lengths[i] > avrgLength) {
                System.out.print(numbers[i] + " - " + lengths[i] + ", ");
            }
        }

        System.out.print("\b\b\n");

        System.out.println("Числа в порядке возростания значений их длины:");

        for (int i = minLength; i <= maxLength; i++) {
            for (Integer number: numbers) {
                if (String.valueOf(number).length() == i) {
                    System.out.println(number);
                }
            }
        }

        System.out.println("Числа в порядке убывания значений их длины:");

        for (int i = maxLength; i >= minLength; i--) {
            for (Integer number: numbers) {
                if (String.valueOf(number).length() == i) {
                    System.out.println(number);
                }
            }
        }
    }
}