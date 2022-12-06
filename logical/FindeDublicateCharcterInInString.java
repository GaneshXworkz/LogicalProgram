package com.xworkz.logical;


public class FindeDublicateCharcterInInString {
	
	public static void main(String[] args) {
		
	
		
		
		String a="dgfgfd";
		String temp=""+a.charAt(0);
		
		for(int i=1;i<a.length();i++) {
			if(!temp.contains(String.valueOf(a.charAt(i))))
				temp=temp+a.charAt(i);
		}
		System.out.println(temp);
	
		
		
		
		
	}

}
