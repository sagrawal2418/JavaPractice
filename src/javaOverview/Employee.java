package javaOverview;

import java.util.Scanner;

/*
 * Write a  program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */
public class Employee
{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter your Basic Salary:");
		
		double salary = data.nextDouble();
		
		double grossSalary=0.0;
		
		if(salary <=10000){
			grossSalary = salary +((salary * 0.2) + (salary * 0.8));
		}
		else if(salary <=20000){
			grossSalary = salary +((salary * 0.25) + (salary * 0.9));
		}
		else if(salary >20000){
			grossSalary = salary +((salary * 0.3) + (salary * 0.95));
		}
		
		System.out.print("Your gross salary is "+grossSalary);
		
}}
