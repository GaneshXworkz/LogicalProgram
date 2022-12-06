package com.xworkz.logical;

import java.util.Scanner;

public class FindNoOfOwlesAndConsunenceInGivenString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		
		String vowels="";
		String consu="";
		
		char[] a=st.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||
					a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') 
			{
				vowels=vowels+(a[i]);
			}
			else if(a[i]==' ')
			{
				continue;
			}
			
			else 
			{
				consu=consu+(a[i]);
			}
			
		}
		System.out.println("vowels are = "+vowels);
		System.out.println("consuence are = "+consu);
			
		
	}

}
