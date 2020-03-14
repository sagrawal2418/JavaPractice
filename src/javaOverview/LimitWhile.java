package javaOverview;

import java.util.Scanner;

/*
 * 17)Given a number n, repeatedly divide it by two if it is even n*2 rule)
 *  and multiply it by 3 and add 1 if it is odd (3n+1 rule) until n reaches 1. 
 *  Print the length of this sequence of numbers, including n and 1.
FOR EXAMPLEFor n = 5 below, the sequence of numbers is 5 16 8 4 2 1, which has a 
length of 6.

15

46
22
7


 */
public class LimitWhile
{
public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
	
	
		while(n >1){
			
		
			if(n %2 ==0){
				System.out.println(n *2);
			}else{
				System.out.println(n *3 +1);
			}
			n = n/2;
			
		}
	
	}
	

}
