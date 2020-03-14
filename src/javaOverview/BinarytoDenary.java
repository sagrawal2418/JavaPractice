package javaOverview;

import java.util.Scanner;
/*
1011%10=1
1011/10=101
 */

public class BinarytoDenary 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		
		int input = console.nextInt();
		int m=input;
		
		int remainder;
		int divider;
		double value=0.0;
		int power = 0;
		
		while(m>0){
			
			remainder = m %10;
			divider = m/10;
			
			m = divider;
			value =value+ (remainder *Math.pow(2,power));
			power++;
		}
		
		
		System.out.println(value);

}}
