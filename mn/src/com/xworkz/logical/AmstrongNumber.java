package com.xworkz.logical;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
	int num=153;
	int t1=num;
	int len=0;
	
	while(t1!=0) {
		
		t1=t1/10;
		len+=1;	
	}
	
	//System.out.println(len);
	
	
	int t2=num;
	  int rem; 
	  int arm=0;
	
	 while(t2!=0) {
		  rem=t2%10;
		  int mul=1;
		  
		  for(int i=1;i<=len;i++) {
			  mul=mul*rem;
		  }
		 arm=arm+mul;
		 t2=t2/10;
				  
	 }
	System.out.println(num);
	System.out.println(arm);
	
	if(num==arm) {
		System.out.println("Amstrong Number");
	}else {
		System.out.println("not Amstrong Num");
	}
	
		
	}

}
