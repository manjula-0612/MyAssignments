package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =7;
		boolean flag=true;

		for(int i=2;i<=n/2;i++)
		{
			
		if(n%i==0)
		{
			flag=false;
			break;
		}
	
   }
		
		if(flag)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}}
