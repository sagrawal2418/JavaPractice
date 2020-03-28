package search_sort;

public class SelectionSort
{

	public static void display(int arr[])
	{
		for(int i= 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSort1(int arr[])
	{
		int value = arr[arr.length-1];
		int i=arr.length-2;
		while(i>=0 && arr[i]>=value ){
		
			arr[i+1]=arr[i];
			i--;
		}
			arr[i+1]=value;
		
		
		display(arr);
		
	}
	
	
	public static void insertionSort(int arr[])
	{
		for(int i =1; i<arr.length; i++){
					
				int key=arr[i];
				int j=i-1;
				
				while( j>=0 && arr[j]>key){
					
					arr[j+1] = arr[j];
					j--;
					
				}
				
				arr[j+1]=key;
				
			
		}

		display(arr);
	}
	public static void bubbleSort(int arr[])
	{
		for(int i= arr.length; i>0; i--){
			
			for(int j = 0; j<i-1; j++){
				
				if(arr[j]>arr[j+1]){
					int t=arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=t;
					
				}
			}
		}
		display(arr);
		
	}
	
	public static void selectionSort(int arr[])
	{
		for(int i= 0; i<arr.length; i++){
			
			for(int j = i+1; j<arr.length; j++){
				
				if(arr[j]<arr[i]){
					int t=arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		display(arr);
		
	}
	
	
	public static void main(String args[])
	{
		int arr[]={51,2,32,9,14,0,25,67,11};
		int arr1[]={5,10,15,20,25,30,35,40,23};
		insertionSort(arr);
		
	}

}
