package javaOverview;
/*
    *
   * *
  * * *
 * * * *
* * * * *
 */
public class PyramidPatern 
{
	public static void main(String [] args)
	{
		
		int m=5;
		for(int i =1;i<=m;i++ )
		{
			
			for(int k =m-i; k>0; k-- ){
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
}