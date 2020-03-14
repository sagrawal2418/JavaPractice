package javaOverview;

import java.util.Scanner;

/*
 * WAP in java to take a input of year from user and calculate and give the output if the 
 * year is leap year or not. 
 * 2016-l
 * 2017-nl
 * 1600-l
 * 1700-nl
 */
public class Year
{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter year:");
		
		int year = data.nextInt();
		
		boolean isLeapYear = false;
		
		if(year % 4 ==0 && year % 100 !=0){
			isLeapYear = true;
		}else if(year % 400 ==0){
			isLeapYear = true;
		}
		System.out.print(isLeapYear);

}
}