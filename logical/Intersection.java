package com.xworkz.logical;

public class Intersection {
public static void main(String[] args) {
	int a1[]= {2,3,4,5,6,7};
	int a2[]= {2,3,6,7,9,10};
	
	for(int i=0;i<a1.length;i++) {
		for(int j=0;j<a2.length;j++) {
			if(a1[i]==a2[j]) {
				System.out.println(a1[i]);
			}
		}
	}
}
}
