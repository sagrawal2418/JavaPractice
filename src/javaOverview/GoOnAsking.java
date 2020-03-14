package javaOverview;

import java.util.Scanner;

/*

5
2
1
-5
-2
6
0



sum=4

0 ois eneterd or sumis going toexceed max
 */
public class GoOnAsking {
	
public static void main(String args[]){
		int max=1000;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = n;
	
		while(n !=0 && sum<=max)
		{
			System.out.println("Please enter 0");
			 n = input.nextInt();
			 
		
				 if(sum +n >=max){
					 break;
				 }
			sum = sum +n;
		
		}
		
		System.out.println(sum);
	}

}
