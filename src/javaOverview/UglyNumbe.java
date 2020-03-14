package javaOverview;
/*


12

1
2
4
6
12

2,3 or 5


45
45/3=15
15/3=5
5/5=1

105
105/5=21
21/3=7
7
 */

import java.util.Scanner;

public class UglyNumbe
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int rem = input;
		boolean ugly = true;
		
		while(rem !=1){
			
			if(rem %2 ==0){
				rem/=2;
			}else if(rem %3 ==0){
			
			rem/=3;
			
		}else if(rem %3 ==0){
			rem/=5;
		}
		else{
		//	System.out.print("Not an ugly number");
			ugly = false;
			break;
			
		}
		
			
		
	}
		System.out.print(ugly?"It is an ugly number":"Not an ugly number");
	}

}
