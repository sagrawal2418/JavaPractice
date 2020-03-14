package javaOverview;

import java.util.Scanner;

/*
 * WAP to find the expressions result till  n terms, where value of n is entered by user.
Y=1/2+2/3-3/4+4/5-5/6+……..n terms

y=1/2+2/3+3/4+4/5+5/6

y=1+2+3+4+5
1/2

Y=+1/2-2/3+3/4-4/5+5/6
 */
public class Series1
{
	public static void main(String[] args){
		
		Scanner data = new Scanner(System.in);
		System.out.println("Enter your n terms:");
		
		int n = data.nextInt();
		double term=0.0,sum=0.0;
		
		for(int i = 1;i<=n;i++)
		{
			term=i/(i+1.0);
			
			
			if(i %2 ==0){
				sum=sum-term;
			}
			else
			{
				sum = sum +term;
			}
			
		}
		System.out.println(sum);
	}

}
/*
 * y=1+2+3+4+5
i=1
sum=1
i=2
sum=1+2=3

 
 */
