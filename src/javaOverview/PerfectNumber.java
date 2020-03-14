package javaOverview;

import java.util.Scanner;

/*

6

1
2
3
3+2+1=6

10

2
5
8*/
public class PerfectNumber 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the number:");
		int input =console.nextInt();
	
		
		for(int i = 1; i<input; i++){
			if(input%i ==0){
				sum = sum +i;
			}
		}
		if(sum ==input){
			System.out.println("this is perfect number");
		}else{
			System.out.println("this is non perfect number");
		}
		
	}

}
