package javaOverview;

import java.util.Scanner;

public class DDAddRow
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many rows and colum you want to insert :");
	int rows = input.nextInt();
	int columns = input.nextInt();
	
	int i;
	int j;
	
	int rowTotal = 0;
	
int arr[][] = new int[rows][columns];

for( i = 0; i<rows;i++){
	
	for(j = 0; j<columns; j++){
		System.out.println("enter the element at row "+(i+1)+" and column "+(j+1)+" :");
		arr[i][j] = input.nextInt();
	}
}
//row=3
//col=4
int col=0;
for( i = 0; i<rows;i++){
	
	for(j = 0; j<columns; j++){
		
		rowTotal = rowTotal +arr[i][j] ;
		
		
	}
	System.out.println("row"+(i+1)+" ="+rowTotal);

	rowTotal = 0;
}
for( i = 0; i<columns;i++){
	
	for(j = 0; j<rows; j++){
		
		col = col +arr[j][i] ;
		
		
	}
	System.out.println("col"+(i+1)+" ="+col);

	col = 0;
}

int arr1[][] = new int[columns][rows];

for(i = 0; i<columns; i++){
	
	for(j = 0; j<rows; j++){
		arr1[i][j] = arr[j][i];
	}
}

for( i = 0; i<columns;i++){
	
	for(j = 0; j<rows; j++){
		
		System.out.print(arr1[i][j]+"   ");
		
		
	}
	System.out.println();

	
}


}}
