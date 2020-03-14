package javaOverview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int input = console.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println("Please enter input ");
			
			 arr[i]= console.nextInt();
			
			
		}
		System.out.println("Which number do you want to delete?");
		int delete = console.nextInt();
		boolean found=false;
		int ind=-1;
		for(int i=0; i<arr.length; i++){
			if(arr[i] ==delete)
			{
				found=true;
				ind=i;
				break;
				
			}
		}
		
		if(found){
			
			for(int i =ind+1; i<arr.length; i++)
			{
				arr[i-1] = arr[i];
				
			}
			
		}
		else
		{
			System.out.println("not found");
		}
		
		System.out.println("Aray="+Arrays.toString(arr));
		
		
		
	}

}
