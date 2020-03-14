package javaOverview;

import java.util.Scanner;

public class DoubleDimension
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][	j]=in.nextInt();
			}
		}
	}
}

/*
 * i=0
 *  j=0
 *  	arr[0][0]=input
 *  j=1
 *  	arr[0][1]=input
 *  j=2
 *  
 *  
 *  i=1
 * 
 * 
 */
