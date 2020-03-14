package javaOverview;
/*
 * 8)Write a  program to input electricity unit charges and calculate 
 * total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill

220
50*0.5+100*0.75+70*1.2

32
220



 */

import java.util.Scanner;
public class ElectricityBiill
{
	public static void main(String args[])
	{
		
	
		Scanner sc=new Scanner(System.in);
	    
		int unit=sc.nextInt();
		
		double charge = 0.0;
		if(unit >0){
			
			if(unit >=1 && unit <51){
				charge = unit * 0.5;
			}else if(unit >50 && unit <151){
				charge = (50 * 0.5)+(unit - 50)*0.75;
			}else if(unit >150 && unit <251){
				charge = (50 * 0.5)+(100 * 0.75) + (unit - 150)*1.2;
			}else{
				charge = (50 * 0.5)+(100 * 0.75) + (100 * 1.2)+ (unit - 250)*1.5;
			}
			
		}
		
		if(charge >0){
			charge = charge * 1.2;
		}
		
		System.out.println("Charge="+charge);
	
	}

}
