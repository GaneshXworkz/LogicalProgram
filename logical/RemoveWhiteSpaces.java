package com.xworkz.logical;

import java.util.Scanner;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String");
	String s = sc.nextLine();

	
	int count=0;
	
	char []g=s.toCharArray();
	
	for(int i=0;i<g.length;i++)
	{
		if(g[i]==' ')
		{
			count+=1;
			continue;
		}
		System.out.print(g[i]);
	}
	System.out.println();
	System.out.println("Number Of Space : "+count);
	
	
	sc.close();
}
}
