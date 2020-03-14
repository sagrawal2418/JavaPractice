package javaOverview;

import java.util.Scanner;

/*

20

1000

371
27+343+1=371
 */

public class ArmstrongNested 
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int input1 = sc.nextInt();
		double sum = 0.0;
		
		for(int i = input; i<input1; i++){
			
			
			int h=i;
			sum = 0.0;
			while(h !=0){
				
				int remainder = h%10;
				 sum = sum + Math.pow(remainder, 3);
				h=h/10;
			}
			System.out.println(i==sum?i:"");
			
		}
			
		}
	}


