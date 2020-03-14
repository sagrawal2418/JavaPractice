package javaOverview;

import java.util.Scanner;

/*
 * 21)	Write a program  to find the largest sum of contiguous subarray of an array.  
Expected Output : 
The given array is : 8 3 8 -5 4 3 -4 -3 5 
The largest sum of contiguous subarray is : 21

1 2 -3 4 -1
0 1 = 1
0 2=3
0 3=0
0 4=4 
0 5 =3
1 2
1 3
1 4
1 5
3 

 

 */
public class LargestContinuous
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
		int max=arr[0],col=0,row=0;
		for(int i=0; i<arr.length-1; i++){
			
			for(int j = i+1; j<arr.length+1;j++ ){
			
				sum=0;
				for(int k = i; k<j; k++){
					
					sum = arr[k]+sum;
					
				}
				if(sum>max){
					max = sum;
					col=j-1;
					row=i;
					
				}
				
				
			}
			
		}
		System.out.println(row+" "+col+" "+"max="+max);
		
		
		
		
	}

}
