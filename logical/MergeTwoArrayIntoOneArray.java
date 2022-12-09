package com.xworkz.logical;

public class MergeTwoArrayIntoOneArray {
	
	public static void main(String[] args) {
		
		
		int[] a= {22,25,86,89,50};
		int b[]= {56,89,75,46,21};
		int c[]= new int[a.length+b.length];
		
		
		for(int i=0;i<b.length;i++) {
			c[i]=b[i];
			
		}
		
		for(int j=0;j<a.length;j++) {
			c[b.length+j]=a[j];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ,");
		}
	}

}
