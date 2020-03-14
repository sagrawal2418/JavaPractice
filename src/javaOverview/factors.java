package javaOverview;

import java.util.Scanner;
/*
10

1
2
5
10

 */
public class factors
{
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int n = data.nextInt();
		int start = 1;
		
		for(int i = 1; i<=n; i++){
			if(n % i ==0){
				System.out.println(i);
			}
		}
}}
