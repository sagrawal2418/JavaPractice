package javaOverview;

import java.util.Scanner;

/*
984

984%10=4
984/10=98

98%10=8
98/10=9

9%10=9
9/10=0

999
9+9+9=27
2+7=9

9199
28
8

9==1=>ugkly otherwise non ugly
 */
public class UglyNumber
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the number:");
		int input =console.nextInt();
		
		if(input<0){
			System.out.println("you have entered the wrong number");

		}else if(input ==1){
			System.out.println("this is ugly number");

		}else{
			sum=input;
			do{
			
			
					int remainder = 0;
					int divide=0;
					int m=sum;
					sum=0;
					while(m>0)
					{
						remainder = m%10;
						divide = m/10;
						m = divide;
						sum = remainder +sum;
					}
					
			}while(sum>9);
			System.out.println(sum);
			
			if(sum ==1)
			{
				System.out.println("this is ugly number");
			}
			else
			{
				System.out.println("this non ugly number");
			}
		}
}
}