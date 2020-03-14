package javaOverview;

import java.util.Scanner;

public class ArrayExpln
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int input = console.nextInt();
		
		int arr[]=new int[input];
		
		int arr1[]={20,12,13,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter teh array no "+(i+1));
			arr[i]=console.nextInt();
		}
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		System.out.println(s);
		
		
	}

}
