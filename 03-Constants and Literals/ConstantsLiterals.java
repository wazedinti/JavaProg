/**********************************************************************

Program Title : Constants and Literals in Java
FileName: "ConstantsLiterals.java"

Programmer : Sathish Sarma
Contact Details : sathish.sarma@newinti.edu.my
Date : 25 August 2025

**********************************************************************/

public class ConstantsLiterals {

    // Constants (use 'final' keyword in Java)
    public static final int MAX_VALUE = 100;          // Integer constant
    public static final double PI = 3.14159;          // Floating-point constant
    public static final char NEWLINE = '\n';          // Character constant
    public static final String MY_NAME = "SATHISH SARMA"; // String constant

    public static void main(String[] args) {
        // Literals
        System.out.println("Integer literal: " + 25);
        System.out.println("Floating-point literal: " + 3.14);
        System.out.println("Character literal: " + 'A');
        System.out.println("String literal: " + "Hello, Java!");

        // Using constants
        System.out.println("Constant MAX_VALUE = " + MAX_VALUE);
        System.out.println("Constant PI = " + PI);
        System.out.println("Lecturer Name = " + MY_NAME);
    }
}
