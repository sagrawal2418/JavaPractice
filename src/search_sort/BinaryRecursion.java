package search_sort;

import java.util.Scanner;

public class BinaryRecursion 
{
	public static int binarySearch(int[] arr, int find, int low, int high, int mid)
		{
		mid = low + (high-low+1)/2;
		if(low>high){
			return -1;
		}
		
		else if(arr[mid] ==find){
			return mid;
		}
		
		else if(arr[mid] >find){
			high = mid-1;
			return binarySearch(arr, find, low, high, mid);
		}else 
		{
			low =mid +1;
			return binarySearch(arr, find, low, high, mid);
		}
	}
	
public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr={1,5,8,10,12,13,15,18,20};
		
		int low = 0;
		int high = arr.length -1;
		int mid ;
		mid = low + (high-low+1)/2;
		System.out.print(binarySearch(arr, 200,low, high, 0));

		
	}

}
