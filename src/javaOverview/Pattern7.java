package javaOverview;
/*

1 2 3 4 5
  2 3 4 5
    3 4 5
      4 5
        5

        */

public class Pattern7 
{
	public static void main(String [] args)
	{
		
		int a = 5;
		int counter = 1;
		int spacing = 2;
		
		for(int i =1; i<=a; i++)
		{
			for(int j =counter ; j<=a; j++){
				System.out.print(j+" ");
				
			}
			counter++;
			System.out.println();
			for(int k = 1; k<=spacing; k++ ){
				System.out.print(" ");
			}
			spacing = spacing +2;
			
		
		}
		
		
	}
	
	

}
