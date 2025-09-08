/**********************************************************************
  
  Program Title : Demonstrating While Loop in Java
  File Name: "WhileLoop.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 08 September 2025
  
 **********************************************************************/

public class WhileLoop {
    public static void main(String[] args) {
        
        //Calculate the sum of numbers from 1 to 10
        int j = 1;
        int sum = 0;
        while (j <= 10) {
            sum += j; // sum = sum + j
            j++;
        }
        System.out.println("Sum of numbers from 1 to 10 = " + sum);

    }
}
