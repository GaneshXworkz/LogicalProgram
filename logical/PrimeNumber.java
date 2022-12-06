package com.xworkz.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number");
		int num=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
			count+=1;	
				}
		
		}
		
		if(count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("not Prime Number");
		}
		
		
		
		
		
		
	}
}
