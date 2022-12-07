package com.xworkz.logical;

public class FirstLetterStringInUpperCase {
	
	public static void main(String[] args) {
		
		String a="my name is gani";
		String stor="";
		
		String[] b=a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			
			char c=b[i].charAt(0);
			
			String s=String.valueOf(c).toUpperCase();
			
			String s1=b[i].substring(1);
			
			stor=stor+s+s1+" ";
			
			}
		
		System.out.println(stor);
		}
}
