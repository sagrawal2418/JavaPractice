package javaOverview;

import java.util.Scanner;

public class RightRotationArray
{
	
	public static void main(String args[])
	{
		Scanner console=new Scanner(System.in);
		System.out.println("Pleas enter size of array");

		int size = console.nextInt();
		int i;
		int arr[] =new int[size];
		
		System.out.println("Pleas enter elements one by one:");
		
		for(i=0;i<arr.length;i++)
		{
			 arr[i]=console.nextInt();
		}
		
		System.out.println("Pleas enter value of k, greater than 0 and less than"+size);
		int k = console.nextInt();
		int j;
		
		if(k<size && k>0){
			int last[] = new int[k];
			i=0;
			for( j = size-k; j<size;j++ ){
				last[i++] = arr[j];
			}
			
		for(int l = size-k-1; l>=0;l--){
			arr[l+k] = arr[l];
		}
		
		for(j= 0; j<k; j++){
			arr[j] = last[j];
		}
		
		
		
			
			
		}
		
	}

}



/*
1 2 3 4 5 6 7 8 9 10
    8 9 10        1 2 3 4 5 6   7
k=3

8 9 10 1 2 3 4 5 6 7 

18 19 20 1 2 3 4 5 6 7 8 


*/