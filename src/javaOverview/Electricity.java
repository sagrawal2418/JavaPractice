package javaOverview;

import java.util.Scanner;

/*
 * Write a  program to input electricity unit charges and calculate total electricity bill according to 
 * the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 */
public class Electricity
{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter your unit");
		
		int unit = data.nextInt();
		double price;
		if(unit <=50)
		{
			price = unit * 0.50;
			
		}else if(unit <=150){
			price = (50 * 0.50)+ ((unit - 50.0)*0.75);
		}else if(unit <=250){
			price = (50 * 0.50)+ (100*0.75) + ((unit - 150) * 1.25);

		}
		else
		{
			price = (50 * 0.50)+ (100*0.75) + (100 * 1.25)+((unit -250)*1.50);
		}
		
		price = price *1.20;
		
		System.out.println("Your bill amount is "+price);
		
	}

}
