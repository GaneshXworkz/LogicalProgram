package com.xworkz.logical;

import java.util.Scanner;

public class ReverseNumberPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int  rem;
		int rev =0;
		int temp=num;
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(temp);
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not Palindrome");
		}
		
	}

}
