package com.fintellix.main;

import java.util.ArrayList;
import java.util.List;

/**
 * Java program to check given String is Palindrome or not using recursion and iteration.
 * @author Mohammad Rafi
 */
public class TestPalindrome {
	
	public static void main(String args[]) {
		
		// taking a list of Strings to check whether the string are Palindrome or not
		List<String> stringList = new ArrayList<String>();
		stringList.add("ababa");
		stringList.add("madam");
		stringList.add("reviver");
		stringList.add("level");
		stringList.add("civic");
		stringList.add("radar");
		for (String string : stringList) {
			System.out.println("Is '"+string+"' is a Palindrome? - "+isPalindromStringUsingRecursion(string));
			System.out.println("Is '"+string+"' is a Palindrome? - "+isPalindromeStringUsingIteration(string));
		}
       
    }

    /**
     * Java method to check if given String is Palindrome
     */
    public static boolean isPalindromStringUsingRecursion(String input){
       String reverseString = reverseTextUsingRecursion(input);
       if(input.equals(reverseString)){
           return true;
       }
     
       return false;
    }
    
    public static boolean isPalindromeStringUsingIteration(String input) {       
        String reverseString = reverseTextUsingRecursion(input);
        return input.equals(reverseString);
    }
   
    /**
     * Reversing a string using recursion
     */
    public static String reverseTextUsingRecursion(String input){
        if(input == null || input.isEmpty()){
            return input;
        }       
        return input.charAt(input.length()- 1) + reverseTextUsingRecursion(input.substring(0, input.length() - 1));
    }
    
    
    /**
     * Reversing a string using iteration
     */
    public static String reverseTextUsingIteration(String input){
    	if(input == null || input.isEmpty()){
            return input;
        }
    	char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
    
}
