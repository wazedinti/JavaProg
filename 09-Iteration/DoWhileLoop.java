/**********************************************************************
  
  Program Title : Demonstrating Do...While Loop in Java
  File Name: "DoWhileLoop.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 08 September 2025
  
 **********************************************************************/

public class DoWhileLoop {
    public static void main(String[] args) {
        
        //Demonstrate loop executes at least once
        int k = 15;
        System.out.println("\nDemonstrating do...while executes at least once:");
        do {
            System.out.println("Value of k = " + k);
            k++;
        } while (k <= 10); // Condition is false, but loop runs once
    }
}
