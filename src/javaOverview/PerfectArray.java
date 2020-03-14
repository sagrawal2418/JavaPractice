package javaOverview;

import java.util.Scanner;

public class PerfectArray
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int input = console.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[input];
		int[] arr1 = new int[input];
		int ind=0;
		boolean pr=true;
		for(int i =0; i<arr.length;i++){
			
			System.out.println("Please enter your array number ");
			
			arr[i] = console.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int number = arr[i];
			pr=true;
			for(int j =2; j<number; j++){
				
				if((number%j ==0)){
					pr = false;
					break;
				}
			}
			if(pr){
				System.out.println(number);
			}
		}
			
			
			
		
		
	}

}
