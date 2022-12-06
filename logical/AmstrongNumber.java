package com.xworkz.logical;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=153;
		int t1=num;
		int len=0;
		
		while(t1!=0) 
		{
			
			t1=t1/10;
			len+=1;
		}
		System.out.println(len);
		System.out.println(t1);
		
		int t2=num;
		int rem = 0;
		int arm =0;
		
		while(t2!=0) 
		{
			rem=t2%10;
			int mul=1;
			
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
			
		}
		
		if(arm==num)
		{
			System.out.println("Amstrong Number : "+arm);

		}
		else
		{
			System.out.println("not Amstrong : "+arm);
		}
		
		
	}

}
