package recursion;

import java.util.Scanner;

/*
 * WAP to print sum of first n even numbers
 * n=5
 * 2+4+6+8+10=>
 */
public class EvenRecursion 
{
  
	public static int evenSum1(int n)
	{
		int s=0;
		for(int i = 1; i<=n;i++)
		{
			s=s+i*2;
			
		}
		return s;
	}
	
	public static int evenSum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return 2*n+evenSum(n-1);
		}
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int f=evenSum(n);
		System.out.println(f);
	}
}

/*Dry Run
 * n=5
 * i=1
 * s=0+2=2
 * i=2
 * s=2+4=6
 * 6+6=12
 * 12+8
 * 20+10=30
 * 
 * 
 * 
 */
