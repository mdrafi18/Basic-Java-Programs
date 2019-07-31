package com.fintellix.main;

import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number using both recursion and iteration
 * Fibonacci number is sum of previous two Fibonacci numbers n(x) = n(x-1)+n(x-2)
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 *
 * @author Mohammad Rafi
 */

public class FibonacciSeriesGenerator {
	
	public static void main(String args[]) {
	    
	       //Reading Input to find the length of the Fibonacci series to be generated
	        System.out.println("Enter number upto which Fibonacci series to print: ");
	        int number = new Scanner(System.in).nextInt();
	      
	        System.out.println("Fibonacci series with " + number +" numbers : ");
	        
	        System.out.println("Fibonacci series using Iteration");
	        for(int i=1; i<=number; i++){
	            System.out.print(fibonacci2(i) +" ");
	        }	  
	        System.out.println("");
	        System.out.println("Fibonacci series using Recursion");
	        for(int i=1; i<=number; i++){
	            System.out.print(fibonacciRecursion(i) +" ");
	        }	 
	    } 
	  

	    /*
	     * Fibonacci series using recursion.
	     */
	    public static int fibonacciRecursion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }	      
	        return fibonacciRecursion(number-1) + fibonacciRecursion(number -2);
	    }
	  
	    
	    /*
	     * Fibonacci series using iteration.
	     */
	    public static int fibonacci2(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacciNum=1;
	        for(int i= 3; i<= number; i++){
	          
	        	fibonacciNum = fibo1 + fibo2;             
	            fibo1 = fibo2;
	            fibo2 = fibonacciNum;
	          
	        }
	        return fibonacciNum; 
	      
	    } 
}
