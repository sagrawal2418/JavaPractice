package javaOverview;

public class ConsecutiveMax 
{
	public static double max(int arr[],int k){
		
		int max = 0;
	
		int maximum=0;
				
				for(int j = 0; j<k; j++){
					maximum = maximum +arr[j];
					
				}
				
				
		for(int i=0; i<=arr.length-k; i++){
			max=0;
			for(int j = 0; j<k; j++){
				max = max +arr[i+j];
				
			}
			
			if(max >maximum){
				
				
				maximum = max;
			}
			
			
		}
		System.out.println(maximum+" "+k);
		double n=(double)maximum/k;
		return n;
	}

	public static void main(String args[])
	{
		int arr[]={1,12,-5,-6,50,3};
		int k=4;
		System.out.println(max(arr,k));
	}
	
}
