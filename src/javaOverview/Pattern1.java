package javaOverview;

/*
A
A B
A B C
A B C D
A B C D E

*
* *
* * *
* * * *
* * * * *
* * * * * *
 */
public class Pattern1
{
	
	public static void main(String [] args){
		for(int i=1;i<4;i++)
		{
			for(int j =1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
i=1
	j=1
		*
	j=2
i=2
	j=1
		*
	j=2
		* *
	j=3
i=3			

 */








