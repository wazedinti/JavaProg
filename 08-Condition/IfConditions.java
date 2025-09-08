/**********************************************************************
  
  Program Title : Demonstrating If, If...Else, Else If, and Nested If in Java
  File Name: "IfConditions.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 08 September 2025
  
 **********************************************************************/

import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // -----------------------
        // 1. Simple if
        // -----------------------
        if (number > 0) {
            System.out.println("This is a positive number.");
        }

        // -----------------------
        // 2. if...else
        // -----------------------
        if (number % 2 == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }

        // -----------------------
        // 3. else if ladder
        // -----------------------
        if (number < 0) {
            System.out.println("Number is negative.");
        } else if (number == 0) {
            System.out.println("Number is zero.");
        } else {
            System.out.println("Number is positive.");
        }

        // -----------------------
        // 4. Nested if
        // -----------------------
        if (number != 0) {
            if (number > 0) {
                System.out.println("Inside nested if: Number is positive.");
            } else {
                System.out.println("Inside nested if: Number is negative.");
            }
        } else {
            System.out.println("Inside nested if: Number is zero.");
        }

        scanner.close();
    }
}
