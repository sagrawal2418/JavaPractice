package javaOverview;
/*
A
A B
A B C
A B C D
A B C D E

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class Pater2 
{
	public static void main(String [] args){
		for(char i='A'; i<='E';i++){
			
			for(char j ='A';j<=i; j++){
				System.out.print((j)+" ");
			}
			System.out.println();
		}
	}

}
