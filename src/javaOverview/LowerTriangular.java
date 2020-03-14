package javaOverview;

import java.util.Scanner;

/*
 *17)	Write a program  to print or display the lower triangular of a given matrix.  
Test Data : 
Input the size of the square matrix : 3 
Input elements in the first matrix : 
element - [0],[0] : 1 
element - [0],[1] : 2 
element - [0],[2] : 3 
element - [1],[0] : 4 
element - [1],[1] : 5 
element - [1],[2] : 6 
element - [2],[0] : 7 
element - [2],[1] : 8 
element - [2],[2] : 9 
Expected Output : 
The matrix is : 
1 2 3 
4 5 6 
7 8 9 
Setting zero in lower triangular matrix 

1 2 3 
0 5 6 
0 0 9 

Setting zero in uppper triangular matrix

1 0 0
4 5 0 
7 8 9


1 2  3  4
5 6  7  8
9 10 11 12
12 14 15 16 

1 2  3  4
0 6  7  8
0 0 11 12
0 0 0  16

1  2  3 4  5  6
7  8  9 10 11 12

 */
public class LowerTriangular
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many rows and colum you want to insert :");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		int i;
		int j;
		
		
		
	int arr[][] = new int[rows][columns];

	for( i = 0; i<rows;i++){
		
		for(j = 0; j<columns; j++){
			System.out.println("enter the element at row "+(i+1)+" and column "+(j+1)+" :");
			arr[i][j] = input.nextInt();
		}
		
		
	}
		
	if(rows==columns)
	{
		for( i = 1; i<rows; i++){
			
			for(j = 0; j<columns; j++){
				
		if(j<i)
		{
				arr[i][j] = 0;
			}
		}
		
	}
		
		
		for( i = 0; i<rows; i++){
			
			for(j = columns-1; j>-1; j--){
				
				if(j>i)
				{
				arr[i][j] = 0;
				}
		}
		
	}
		
	}
	
	
	
}
