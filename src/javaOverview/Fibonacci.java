package javaOverview;

import java.util.Scanner;

/*
0 1 1 2 3 5 8 13 21 .... n terms 

a=0
b=1

c=a+b=1
a=b
b=c





n=5
0 1 1 2 3 

 */
public class Fibonacci
{

	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("enter the number:");
		int input =console.nextInt();
		int a=0,b=1,c=0;
		
		if(!(input<2))
		{
			System.out.print("0 1 ");
			for(int i =0; i<input-2; i++)
			{
				c = a+b;
				a = b;
				b = c;
				
				System.out.print(c+" ");
			}
		}
		else if(input==1)
		{
			System.out.print("0 ");
		}
		else
		{
			System.out.print("Invalid ");
		}
		
		
		
		
	}
	

}
