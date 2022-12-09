package com.xworkz.logical;

import java.util.Scanner;

public class ReverseWord {

	    public static void main(String[] args) {
		Scanner sp=new Scanner(System.in);
		
		System.out.println("enter the sentence:");
		String sentence=sp.nextLine();
		
		System.out.println("enter the word :");
	    String word=sp.next();
		
	    String reverse="";
		
		String[] str=sentence.split(" ");
		
		for(int i=0;i<str.length;i++) 
		{
			if(str[i].equals(word)) 
			{
				char ch[]=word.toCharArray();
				
				for(int j=word.length()-1;j>=0;j--) 
				{
					reverse=reverse+ch[j];
				}
				str[i]=reverse;
	
			}
			
		}
		for(int i=0;i<str.length;i++) 
		{
			System.out.print(str[i]+" ");
		}
	sp.close();
	}

}
