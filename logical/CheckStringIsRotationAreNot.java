package com.xworkz.logical;

import java.util.*;

public class CheckStringIsRotationAreNot {
	

	// Java program for the above approach
	 
	
	 

	    static boolean check_rotation(String s, String goal)
	    {
	        if (s.length() != goal.length())
	            return false;
	 
	        Queue<Character> q1 = new LinkedList<>();
	        for (int i = 0; i < s.length(); i++) {
	            q1.add(s.charAt(i));
	        }
	 
	        Queue<Character> q2 = new LinkedList<>();
	        for (int i = 0; i < goal.length(); i++) {
	            q2.add(goal.charAt(i));
	        }
	 
	        int k = goal.length();
	        while (k > 0) {
	            k--;
	            char ch = q2.peek();
	            q2.remove();
	            q2.add(ch);
	            if (q2.equals(q1))
	                return true;
	        }
	 
	        return false;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	        String str1 = sc.next();
	        String str2 = sc.next();
	 
	        // Function call
	        if (check_rotation(str1, str2))
	            System.out.println(
	                "Strings are rotations of each other");
	        else
	            System.out.printf(
	                "Strings are not rotations of each other");
	    }
	}


