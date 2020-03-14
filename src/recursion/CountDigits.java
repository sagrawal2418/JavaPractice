package recursion;

import java.util.Scanner;

public class CountDigits 
{
	/*
	 * 564
	 * 3
	 * 7414
	 * 4
	 * 532
	 * 53
	 * 5
	 * 
	 */
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(numberOfDigits(input));
		
		
		
	}
	
	public static int numberOfDigits(int n){
		
		if(n/10 ==0){
			return 1;
		}else{
		return 1+numberOfDigits(n/10);
		}
	}
	

}
