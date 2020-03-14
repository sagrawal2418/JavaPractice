package javaOverview;

import java.util.Scanner;

/*
371

27+349+1=371

371%10=1
371/10=37

37>0
37%10=7
37/10=3

3%10=3
3/10=0


 */
public class ArmstrongNumber 
{
	
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int n = data.nextInt();
		int m=n;
		int remainer ,sum=0;
		while(m>0){
			remainer= m%10;
			m = m/10;
			sum =sum+ remainer*remainer*remainer; 
			
		}
		if(sum == n)
		{
			System.out.print("it is armstrong");
		}else{
			System.out.print("it is not armstrong");

		}
		
		
		
	}

}
