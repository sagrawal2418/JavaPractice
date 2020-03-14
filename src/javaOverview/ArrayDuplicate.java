package javaOverview;

import java.util.Scanner;

/*
1 2 3 2 4 2 5 2 6 5 4 6 2


dup-2 
 */
public class ArrayDuplicate 
{
	public static void main(String args[])
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Pleas enter size of array");

		int size = console.nextInt();
		int i;
		int arr[] =new int[size];
		int dup[] = new int[size];
		int ind=-1;
		
		System.out.println("Pleas enter elements one by one:");
		int j;
		for(i=0;i<arr.length;i++)
		{
			 arr[i]=console.nextInt();
		}
		int count;
		for( j =0; j<size; j++)
		{
			count=0;
			if(!(ind<0)){
			  for(i = 0; i<=ind; i++ ){
				  if(dup[i] == arr[j])
				  {
					  count=1;
					 break; 
				  }
				  
			  }
		  }
			if(count<1)
			{
		   count=0;
			for(i=0; i<size;i++){
				if(arr[j]==arr[i])
				{
					count++;
					if(count>1)
						break;
				}
			}
			
			if(count>1)
			dup[++ind]=arr[j];
			
			
			}
			
		}
		
		for(i=0;i<=ind;i++)
			System.out.println(dup[i]);
		
	}
}

/*
5 6 5 1 2 5 3 2 6 
5
5 is 3 times
count=3
 */
