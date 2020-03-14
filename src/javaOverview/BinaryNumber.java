package javaOverview;

import java.util.Scanner;

public class BinaryNumber
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		
		int input = console.nextInt();
		int m=input;
		String s="";
		while(m>0){
			
			int remainder = m %2;
			//System.out.print(remainder);
			s=remainder+s;
			m = m/2;
		}
		System.out.println(s);
	}
	

}

/*
m=26
rem=0
s=0+""=0
m=13
re=1
s=1+0=10
m=6
r=6/2=0
s=010
,m=3
rem=3%2=1
s=1010
m=1

rem1%2=1

s=11010
 */
