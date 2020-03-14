package javaOverview;

import java.util.Scanner;

/*
you can only take a input of number between 20 and 100
if user inputrs any other no , throw an error message and ask for input again 

110
worng 
10
wrong 

we want too give a max limit of entry as 5
 */

public class DoWhileExplain 
{
	
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		int max=5;
		int wrong = 1;
		System.out.println("enter the number:");
		int input =console.nextInt();
		
		while((input <20 || input>100) && wrong<max)
		{
			wrong++;
			System.out.println("entered number is out of bounds!!Input again ");
			input = console.nextInt();
		
		}
		
		if(wrong==max && (input <20 || input>100) ){
			System.out.println("You have exceeded the limit");

		}
		else
		{
			System.out.println("entered number is "+input);

		}
	}

}

