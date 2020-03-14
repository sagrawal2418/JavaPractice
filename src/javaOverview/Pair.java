package javaOverview;

import java.util.Scanner;

/*
 * 
 * 20)	Write a program  to find a pair with given sum in the array.  
Expected Output : 
The given array : 6 8 4 -5 7 9 
The given sum : 15
Pair of elements can make the given sum by the value of index 0 and 5


 */
public class Pair 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int input = console.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[input];
		int ind=0;
		boolean pr=true;
		for(int i =0; i<arr.length;i++){
			
			System.out.println("Please enter your array number ");
			
			arr[i] = console.nextInt();
		}
		
		System.out.println("Please enter the sum for the pair");
		 sum = console.nextInt();
		 
		 
		 
	
		 
		 for(int j = 0; j<arr.length-1; j++ ){
		 
		 for(int i = j+1; i<arr.length; i++){
			 
			 if(arr[i] + arr[j]==sum){
				 System.out.println("Matched pair"+arr[j]+" "+arr[i]);
			 }
			 
			 
		 }}
		
		

}}
