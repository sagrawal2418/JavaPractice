package javaOverview;

import java.util.Scanner;

/*
 To count No of digits in a number
 546
 3
 3666
 4
 359
 359/10=35
 35/10=3
 3/10=0
 
 */
public class DigitCount
{
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int input = data.nextInt();
		int c=0;
		
		while(input >0){
			input = input /10;
			c++;
			
		}
		System.out.println(c);	
	}

}

/*
2356
input>0
	input=235
	c=1


 */










