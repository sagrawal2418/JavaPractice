package javaOverview;
/*
*
* *
* * *
* * * *
* * * * *
* * * * * *
 */
public class WhileExplain 
{
	
	public static void main(String [] args){
		
		int i=1,j=1;
		while(i<5)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}


}
