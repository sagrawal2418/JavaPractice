package javaOverview;

import java.util.Scanner;

/*

*
* -
* - * 
* - * - 
* - * - * 


 */
public class patern5 {
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter your n terms:");
		int n = data.nextInt();
		
		for(int i =0; i<=n;i++){
			System.out.println("");
			
			for(int j = 1; j<=i+1; j++){
				if(j %2 ==0){
					System.out.print("-");
				}else{
					System.out.print("*");
				}
		
			}
		}
		
		
	}

}
