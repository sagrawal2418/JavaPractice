package javaOverview;

import java.util.Scanner;

/*
 * Write a  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
 * Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 50% : Grade E
Percentage < 40% : Grade F
 */
public class StudentMarks
{
	public static void showGrade(float avg){
		if(avg>=90)
		{
			System.out.println("Percentage ="+avg+" Grade A");
		}
		else if(avg>=80)
		{
			System.out.println("Percentage ="+avg+" Grade B");
		}
		else if(avg>=70)
		{
			System.out.println("Percentage ="+avg+" Grade C");
		}
		else if(avg>=60)
		{
			System.out.println("Percentage ="+avg+" Grade D");
		}
		else if(avg>=50)
		{
			System.out.println("Percentage ="+avg+" Grade E");
		}
		else
		{
			System.out.println("Percentage ="+avg+" Grade F");
		}
	}
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		
		System.out.println("Please enter your Physics grade:");
		float phy=data.nextFloat();
		
		System.out.println("Please enter your Chemistry grade:");
		float chm=data.nextFloat();
		
		System.out.println("Please enter your Biology grade:");
		float bio=data.nextFloat();
		
		System.out.println("Please enter your Mathematics grade:");
		float mat=data.nextFloat();
		
		System.out.println("Please enter your Computer grade:");
		float cmp=data.nextFloat();
		
		float total = phy +chm +bio+mat+cmp;
		float average = total /5.0f;
		showGrade(average);		
		
	}
	

}
