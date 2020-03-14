package javaOverview;

import java.util.Scanner;

public class BinarySearch
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("Enter the size of the array.");
		int size = console.nextInt();
		int k = 0;
		int array[] = new int [size];
		for(k = 0; k < size; k++)
		{
			
			array[k] = 3*k;
		}
		/*
		 l
		 h
		 m
		 
		 */
		System.out.println("Enter the sitem to search:");
		int item=console.nextInt();
		
		int low = 0;
		int high = array.length;
		boolean flag=false;
		
		while(low<high)
		{
			int middle = (low+high)/2;
			if(item >array[middle] )
			{
				low = middle +1;
		
			}else if(item < array[middle]){
				
				high = middle -1;
			}
			else{
				System.out.println("Item found");
				flag=true;
				break;
				
		}
		
			
			
		}
		
		if(!flag)
		{
			System.out.println("Item not found");
		}
		
		
		
	}

}
