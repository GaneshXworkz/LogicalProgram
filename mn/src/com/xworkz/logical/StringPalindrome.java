package com.xworkz.logical;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String sent=sc.nextLine();
		
		String rev="";
		
		char[] c=sent.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+(c[i]);
			
		}
		
		System.out.println(sent);
		System.out.println(rev);
		
		if(sent.toUpperCase().equals(rev.toUpperCase())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}

		
		
		
		
		
		
		
		
		
		
	}

}
