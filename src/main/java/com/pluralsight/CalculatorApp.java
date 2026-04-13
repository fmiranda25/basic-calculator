package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        double finalResult = 0.0;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double answer1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        double answer2 = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:");
        String responseChar = input3.nextLine();

        if (responseChar.equals("a") || responseChar.equals("A")) {
            finalResult = answer1 + answer2;
            System.out.println(String.format("%.2f", finalResult));
        }
        if (responseChar.equals("s") || responseChar.equals("S")) {
            finalResult = answer1 - answer2;
            System.out.println(String.format("%.2f", finalResult));
        }
        if (responseChar.equals("m") || responseChar.equals("M")) {
            finalResult = answer1 * answer2;
            System.out.println(String.format("%.2f", finalResult));
        }
        if (responseChar.equals("d") || responseChar.equals("D")) {
            finalResult = answer1 / answer2;
            System.out.println(String.format("%.2f", finalResult));
        }
    }
}
