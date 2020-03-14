package javaOverview;

import java.util.Scanner;
import java.util.Arrays;

/*
10

20


15,14,16,17,20,11,13,14

10
12
18
19

 */
public class ArrayMissingNumber
{
	public static void main(String args[])
	{
		int[] numbers ={15,14,16,17,20,11,13,14};
		int[] missing = new int[10];
		int ind=0;
		for(int i =10; i<=20; i++){
			
			boolean missing1 = true;
			for(int j:numbers){
				
				if(i ==j){
					missing1=false;
					
				}
			
			}
			
			if(missing1){
				missing[ind++] = i;			}
			
			
				}
		
		
		System.out.println(Arrays.toString(missing));
		
		
	}

}
