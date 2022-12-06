package com.xworkz.logical;

import java.util.Scanner;

public class FibonaccieSeries {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num= sc.nextInt();
		
		int f=0;
		
		int s=1;
		
		int t;
		
		System.out.print(" ,"+f);
		System.out.print(" ,"+s);
		
		for(int i=2;i<=num ;i++ ) {
			t=f+s;
			System.out.print(" ,"+t);
			f=s;
			s=t;
		}
		
		 
		
		
		
		
		
	}

}
