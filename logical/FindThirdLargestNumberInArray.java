package com.xworkz.logical;

public class FindThirdLargestNumberInArray {
	
	public static void main(String[] args) {
		 int temp =0; 
		
		int a[]= {56,89,12,47,36,97};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++) 
			{
				
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	
		
		System.out.println("3rd largest Number in array : "+a[a.length-3]);  
	}
	

}
