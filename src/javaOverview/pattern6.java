package javaOverview;

import java.util.Scanner;

/*
 
*
- *
- * -
* - * -
* - * - *

 */
public class pattern6
{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter your n terms:");
		int n = data.nextInt();
		String prev="-";
		for(int i =0; i<=n; i++){
			System.out.println("");
			
			for(int j =1; j<=i; j++){
				if(prev.equals("-")){
					System.out.print("* ");
					prev="*";
				}else{
					System.out.print("- ");
					prev="-";
				}
			}
		}

}}
