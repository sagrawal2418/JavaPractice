package javaOverview;
/*

    *
   * *
  * * *
 * * * *
* * * * *  

 */

import java.util.Scanner;

public class Patern4
{
	public static void main(String[] args){
	Scanner data = new Scanner(System.in);
	System.out.println("Enter your n terms:");
	String sp=" ";
	int n = data.nextInt();
	
	for(int i = 0; i<=n;i++){
		
	for(int k = n; k> i ;k--)
	{
		System.out.print(sp);
	}
		
		for(int j =1;j<=i; j++){
			System.out.print("* ");
		}
		System.out.println("");
	}
	
	
}

}
