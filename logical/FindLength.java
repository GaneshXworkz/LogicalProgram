package com.xworkz.logical;

public class FindLength {
	
	static void check(String[] arr) {
		
		if(arr.length==0)
		{
			System.out.println(arr.length +" no Likes");
		}
		else if(arr.length==1)
		{
			System.out.println(arr[0] +"  one likes");
			
		}
		else if(arr.length==2) 
		{
			System.out.println(arr[0]+" "+arr[1]+" "+ " two Likes");
			
		}
		else if(arr.length==3) 
		{
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+ " three Likes");
		}
		else 
		{
		   System.out.println( arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[4]+" " + " Four Likes");	
		}
	
		
	
	public static void main(String[] args) {
		
		String arr1[]= {};
		String arr2[]= {"manu"};
		String arr3[]= {"manu","raju"};
		String arr4[]= {"manu","raju","ravi"};
		
		
		check(arr1);
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
