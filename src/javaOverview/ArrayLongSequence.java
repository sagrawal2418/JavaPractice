package javaOverview;

/*

5 5 2 2 5 2 2 2 2 2 2 2 5  3 5 5 5 5 5 3 

no ,no of longest terms 

 */

public class ArrayLongSequence
{
	public static void main(String args[])
	{
		int[] numbers ={5,5,2, 2, 5, 2, 2, 2, 2,2,2, 5,  3, 5, 5, 5, 5, 5, 3 };
		int long_term=1;

		int lastnum = numbers[0];
		int elem= numbers[0];
		int numberOfEntries = 1;
		int max=1;
		for(int i = 1;i<numbers.length; i++){
			
			if(numbers[i]==lastnum){
				
				numberOfEntries++;
				lastnum=numbers[i];
				
			}else{
				if(numberOfEntries >max){
					
					max = numberOfEntries;
					elem=lastnum;
					
				}
				
				numberOfEntries = 1;
				lastnum = numbers[i];
				
			}
			
			
			
		}
		System.out.println("lastnum"+elem+"numberOfEntries"+max);
	}

}
