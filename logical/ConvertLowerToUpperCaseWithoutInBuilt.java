package com.xworkz.logical;

import java.util.Scanner;

public class ConvertLowerToUpperCaseWithoutInBuilt {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Lower case");
		String a=sc.next();
		
		String stor="";
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(97<=ch && ch<=122) {
				stor=stor+(char)((ch-32));
				
			}
		}
	
		System.out.println(stor);
		
		
		
		
		
	}
}
