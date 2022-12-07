package com.xworkz.logical;

public class SecondLargestNumberInArray {

	 public static void main(String args[]){
		 
		 int []a= {78,98,45,25,36};
		 int temp;
		 
		 for(int i=0;i<a.length;i++) 
		 {
			 
			 for(int j=i+1;j<a.length;j++) 
			 {
				if(a[j]<a[i]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				} 

			 }
				System.out.println(a[i]);  
		 }
		 
		 System.out.println("Second largest number : "+ a[a.length-2]);
		 
		 
	     	   }
}
