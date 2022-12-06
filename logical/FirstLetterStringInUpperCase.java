package com.xworkz.logical;

public class FirstLetterStringInUpperCase {
	
	public static void main(String[] args) {
		
		String set="my name is ganesh";
		String stor="";
		
		String []arr= set.split(" ");
		
		for(int i=0;i<arr.length;i++) 
		{
			char c=arr[i].charAt(0);
			
			String c1=String.valueOf(c).toUpperCase();
			
			String sub =arr[i].substring(1);
			
			stor=stor +c1 +sub+" ";
			
			
		}
		System.out.println(stor);
	}

}
