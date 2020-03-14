package javaOverview;

import java.util.Scanner;

/*
m=954
rem=4
rev=4

m=95
rem=5
rev=40+5=45

m=9
rem=9
rev=459

m-=0

 */
public class pallindromeNumbe
{

public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int remainder = 0;
		int m=n;
		int rev = 0;
		if(n >9){
			
			while(n>0){
			
				remainder = n %10;
				rev = rev *10 +remainder;
				n/=10;
			}
			
			System.out.print(rev==m?"It is a pallindrome":"It is not a pallindrome");
			
		}
		
	}
	
}
