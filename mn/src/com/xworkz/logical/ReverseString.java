package com.xworkz.logical;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name=sc.nextLine();
		
		char[] c= name.toCharArray();
		String rev="";
		
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+(c[i]);
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
