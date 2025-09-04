/**********************************************************************
Program Title : Input and Output Demonstration
File Name     : "InputOutput.java"

Programmer    : Sathish Sarma
Contact Details : sathish.sarma@newinti.edu.my
Date          : 2 September 2025
**********************************************************************/

import java.util.Scanner;

class InputOutput {

public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter name and age :");

	String name = myObj.nextLine();
	int age = myObj.nextInt();

	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	}
}
