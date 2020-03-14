package javaOverview;

import java.util.Scanner;

/*
     5 4 3 2 1
      4 3 2 1
       3 2 1
        2 1
         1
 */
public class pattern11 
{
public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = n; i>=1; i--){
			
			for(int k = 1; k<=(n-i); k++){
				System.out.print(" ");
				
			}
			
			for(int j = i; j>=1; j--){
				
				System.out.print(j+" ");
				
			}
		
			System.out.println();
			
		}
		
		
	}

}
