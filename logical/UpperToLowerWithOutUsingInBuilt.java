package com.xworkz.logical;

import java.util.Scanner;

public class UpperToLowerWithOutUsingInBuilt {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter UPPER CASE String");
		String a=sc.next();
		
		String stor="";
		
		for(int i=0;i<a.length();i++) {
		    char ch=a.charAt(i);
			if(65<=ch && ch<=90) 
			{
			 
				stor=stor+(char)((ch+32));
				
			}	
		}
		System.out.println(stor);
			
			
		// 65 to 96 Upper case
		// 97 to 122 Lower case
		
		
		
		
		
		
	}
	
	
}
