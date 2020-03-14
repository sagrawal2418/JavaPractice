package javaOverview;

import java.util.Scanner;

/*
123
123%10=3
123/10=12

12%10=2

3*10=30+2=32

1%10=1
32*10=320+1=321

1/10=0

 */
public class pallindromeNumber 
{
	
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int n = data.nextInt();
		int m=n;int remainder = 0;
		
		int sum=0;
		while(m>0){
			remainder = m %10;
			sum=sum*10+remainder;
			 m= m/10;
			
		}
		System.out.println(sum);
		if(sum == n){
			System.out.println("Number is palindrome number");
		}else{
			System.out.println("Number is not palindrome number");

		}
		
		
		
	}

}
/*
1234
1234>0
	r=1234%10=4
	s=0+4=4
	m=123
123>0
	r=3
	s=43
	m=12
12>0
	r=2
	s=432
	m=12/10=1
1>0
	r=1
	s=432*10+1=4320+1=4321
	m=0
	
0>0
	
 */

