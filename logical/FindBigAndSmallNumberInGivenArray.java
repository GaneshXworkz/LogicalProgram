package com.xworkz.logical;

public class FindBigAndSmallNumberInGivenArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,5,565,654,887,654,1,6548,788};
		
		int max=a[0];
		int min=a[0];
		
			for(int i=1;i<a.length;i++) {
			
				if(max<a[i]) 
				{
					max=a[i];
				}
				else if(min>a[i]) 
				{
					min=a[i];
					
				}
					
			}
			
			System.out.println(max);
			System.out.println(min);
		
	
	
		
	}
}
