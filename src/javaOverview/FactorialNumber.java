package javaOverview;

import java.util.Scanner;

/*
5
1*2*3*4*5=120
 */
public class FactorialNumber
{
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int n = data.nextInt();
		int total = 1;
		
		for(int i = 1; i<=n; i++){
			total = total *i;
		}
		System.out.println(total);
	}
	

}
