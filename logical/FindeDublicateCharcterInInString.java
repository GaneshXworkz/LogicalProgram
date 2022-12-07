package com.xworkz.logical;


public class FindeDublicateCharcterInInString {
	
	public static void main(String[] args) {
		
	
		
		
		String name="namehnae";
		String temp=""+name.charAt(0);
		
		for(int i=1;i<name.length();i++) 
		{
			if(!temp.contains(String.valueOf(name.charAt(i))))
				
				temp=temp+name.charAt(i);
			
		}
		System.out.println(temp);
		
		
	}

}
