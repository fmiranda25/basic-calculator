package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        float finalResult = 0;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float answer1 = input1.nextFloat();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number:");
        float answer2 = input2.nextFloat();

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
            System.out.println(String.format("%.2f", answer1) + " + " + String.format("%.2f", answer2) + " = " + String.format("%.2f", finalResult));
        }
        if (responseChar.equals("s") || responseChar.equals("S")) {
            finalResult = answer1 - answer2;
            System.out.println(String.format("%.2f", answer1) + " - " + String.format("%.2f", answer2) + " = " + String.format("%.2f", finalResult));
        }
        if (responseChar.equals("m") || responseChar.equals("M")) {
            finalResult = answer1 * answer2;
            System.out.println(String.format("%.2f", answer1) + " * " + String.format("%.2f", answer2) + " = " + String.format("%.2f", finalResult));
        }
        if (responseChar.equals("d") || responseChar.equals("D")) {
            finalResult = answer1 / answer2;
            System.out.println(String.format("%.2f", answer1) + " / " + String.format("%.2f", answer2) + " = " + String.format("%.2f", finalResult));
        }
    }
}