package javaOverview;

import java.util.Scanner;

/*
WAP totake a input of two numbers and than print all the numbers inbetween 
tham  which are perfecty number

5

60

6
1+2+3=6

10
1+2+5=8
 */

public class MultipleFactor
{
	public static void main (String []args){
		
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		boolean oneBig = false;
		if(one > two){
			oneBig = true;
		}
		int num,total;
		for(int i=(oneBig?two:one); i<(oneBig?one:two);i++){
			num=i;
			total=0;
			//System.out.println(i);
			for(int j = 1; j<=i/2; j++){
			 
				
				 if(i%j == 0){
					 
					 total = j + total;
					 
					 
				 }
				// System.out.println(total);
				
			}
			if(num ==total){
				System.out.println(num);
			}
			
		}
	}

}
