package javaOverview;
/*
 * 3)Write a program to take input of name in one variable
 *  and a number in one variable and print the output in below format
Example:

Input:
a=ram
b=5

output:
ram1
ram2
ram3
ram4
ram5
 */
import java.util.Scanner;
public class loopQu1
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int num = sc.nextInt();
		
		if(name!=null && num >0){
			
			for(int i = 1; i<=num; i++){
				
				System.out.println(name+i);
				
				
			}
		}
		
	}

}
