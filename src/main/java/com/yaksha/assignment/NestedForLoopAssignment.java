package com.yaksha.assignment;

import java.util.Scanner;

public class NestedForLoopAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Print a right-angled triangle pattern
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 2: Multiplication table grid
        System.out.println("Multiplication table grid from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        // Task 3: Find prime numbers within a range
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        for (int num = lowerLimit; num <= upperLimit; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Task 4: Floyd's triangle
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = scanner.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        // Task 5: Create a multiplication table of any number
        System.out.print("Enter a number for the multiplication table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
