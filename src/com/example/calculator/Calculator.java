package com.example.calculator;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Simple Calculator");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.println("Choose an operation");

            int choice = scanner.nextInt();
	    scanner.nextLine();
            if (choice == 5) break;

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
		default:
                    System.out.println("Invalid choice");
                }
                System.out.println();

        }
        scanner.close();
    }
}
