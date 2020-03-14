package javaOverview;
/*
A B C * D E F
A B * D E
A * B


 */

import java.util.Scanner;

public class Patern10 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);
		int a=64;
		char ch;
		for(int i = 1; i<=3; i++){
			
			System.out.println();
			for(int j = 7; j>1;j--){
				ch=(char)(a+j);
				System.out.print(ch +" ");
			}
			
			
		}
		
	}
	

}
