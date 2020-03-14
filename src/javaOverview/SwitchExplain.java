package javaOverview;
import java.util.Scanner;
/*
 * 1)	WAP to accept a number from user and using switch user will get the choice to do a operations among some of operations as below. 
------------------------------------------------------------------------
                                          MENU
1)	                                                                      Odd/even
2)	                                                                      Positive negative
3)                                                                        prime number
--------------------------------------------------------------------------

 */
public class SwitchExplain 
{
	public static void main(String[] args)
	{
		Scanner data = new Scanner(System.in);
		char ch='y';
		while(ch=='y' || ch=='Y')
		{
		System.out.println("Enter your number:");
		
		int no = data.nextInt();
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1)	                                                                      Odd/even");
		System.out.println("2)	                                                                      Positive/Negative");
		System.out.println("3)	                                                                      Prime Number");
		System.out.println("4)	                                                                      Exit");
		System.out.println("Enter your Choice:");
		
		int a = data.nextInt();
		
		switch(a){
		case 1:
			if(no %2 == 0)
			{
				System.out.println("Even");
			
				
			}else{
				System.out.println("Odd");
			}
			
			break;
		case 2:
			if(no>0){
				System.out.println("Positive");
				
			}
			else if(no<0){
				System.out.println("Negative");
			}
			else
			{
				System.out.println("Neutral");
			}
		break;	
		case 3:
			boolean flag=true;
			for(int i = 2; i<no; i++){
				if(no % i ==0)
				{
					System.out.println("Not Prime");
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println("Prime");
			}
			break;
			
		case 4:
			System.exit(0);
			default:
				System.out.println("OOPs!!!!Wrong Choice ");
		}
		
		System.out.println("Do You want to continue(Y/N)?:");
		ch = (char)(data.next().charAt(0));
		}	
	}

}
