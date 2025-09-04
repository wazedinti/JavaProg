/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        int i = 123456789;
        double d = 19.99;
        char c = 'A';
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");
		
		//Finding data type size using BYTES
		System.out.println("Size of int: " + Integer.BYTES + " bytes.");
		System.out.println("Size of char: " + Character.BYTES + " bytes.");
		
		//Finding data type size using SIZE
		System.out.println("Size of char: " + Character.SIZE + " bits.");
		System.out.println("Size of double: " + Double.SIZE + " bits.");
		
		//Finding data type range minimum and maximum value
		System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".");
		System.out.println("Maximum value for double range: " + Double.MAX_VALUE + ".");
        
    }
}
