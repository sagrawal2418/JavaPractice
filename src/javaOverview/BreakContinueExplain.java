package javaOverview;

import java.util.Scanner;

public class BreakContinueExplain
{
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		
		
		for(int i=0;i<100;i++)
		{
			if(i==10)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
