package recursion;

/*
5!
5*4*3*2*1=120
Base Condition 

*/
import java.util.Scanner;

public class Factorial
{
	
	public static int factorial(int n)
	{
		if(n==1)
		{
			System.out.println(1);
			return 1;
		}
		else
		{
			int m=factorial(n-1);
			System.out.println("factorial(int "+n+")="+n*m);
			return n*m;
		}
	}
	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=s.nextInt();
		int f=factorial(n);
		System.out.println(f);
	}

}
