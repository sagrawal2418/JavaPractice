package javaOverview;

import java.util.Scanner;

public class whileExpln 
{
public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		while(m<n)
		{
			System.out.println("Please enter amount greater than or equal to"+n);
			m = input.nextInt();
			
		
		}
		
		System.out.println(m);
	}
	

}
