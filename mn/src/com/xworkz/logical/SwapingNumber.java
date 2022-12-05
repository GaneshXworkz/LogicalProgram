package com.xworkz.logical;

import java.util.Scanner;

public class SwapingNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eanter first numer a = ");
		int a=sc.nextInt();
		
		System.out.println("Eanter Second numer b = ");
		int b=sc.nextInt();
		
		int c;
		
		 c=a;
		 a=b;
		 b=c;
		
		System.out.println("b= "+a);
		System.out.println("a = "+b);
				
		
	}

}
