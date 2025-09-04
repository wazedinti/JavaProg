/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java
  File Name: "VariableDataTypes.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class VariableDataTypes {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------");

        // Primitive Data Types
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        System.out.println("\n--- Non-Primitive Data Types ---");

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};


        System.out.println("String value: " + str);
        System.out.println("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
