package com.fintellix.main;
/**
 * Java program to find the factorial of a number using recursion and iteration.
 */

public class Factorial {
    public static void main(String args[]) {
        
        // Finding factorial using recursion
        System.out.println("Factorial of 5 using recursion is: " + factorialUsingRecursion(5)); 
        
        // Finding factorial using Iteration
         System.out.println("Factorial of 6 using iteration is: " + factorialUsingIteration(6)); 
      }
    
    
      /*
       * Finding factorial using recursion
       */
      public static int factorialUsingRecursion(int number){       
          //base case
          if(number == 0){
              return 1;
          }
          return number*factorialUsingRecursion(number -1); //is this tail-recursion?
      }
      
    
      /*
       * Finding factorial using Iteration
       */    
      public static int factorialUsingIteration(int number){
          int factorial = 1;
          while(number != 0){
        	  factorial = factorial*number;
              number--;
          }
        
          return factorial;
      }
}



