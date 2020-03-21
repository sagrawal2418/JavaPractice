package search_sort;

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr={1,5,8,10,12,13,15,18,20};
		
		int find = 200;
		
		int low = 0;
		int high = arr.length -1;
		int mid ;
		boolean found = false;

		while(low<=high){
			mid = low + (high-low+1)/2;
			System.out.println(low+" "+high+" "+mid);
			if(arr[mid] ==find){
				found = true;
				System.out.print("Found the number"+find);
				break;
			}
			
			else if(arr[mid] >find){
				high = mid-1;
			}else if(arr[mid]<find)
			{
				low =mid +1;
			}
			
		}
		if(found==false)
		System.out.print("Did not Find the number"+find);

		
	}

}
