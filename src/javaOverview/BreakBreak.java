package javaOverview;

import java.util.Scanner;

public class BreakBreak
{
	
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		int i,j;
		aa:
		for(i=0;i<5;i++)
		{
			for(j=0;j<6;j++)
			{
				if(j==3)
				{
					break aa;
				}
				System.out.println("j="+j);
					
			}
			System.out.println("i="+i);
		}
		
	}

}
