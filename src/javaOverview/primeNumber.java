package javaOverview;

import java.util.Scanner;

/*

to print prime numbers betyween two number taken as input
5
20

5
7
11
13
17
19

5
15

5
6
7

15

 */
public class primeNumber 
{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		int num=0;
		for(int j= (num1>num2?num2:num1);j<=(num2<=num1?num1:num2) ;j++ ){
			
			num=j;
			boolean flag=true;
			
			if(num >1){
				
				for(int i = 2; i<=num/2; i++){
					
					if(num % i == 0){
						
						flag=false;
						break;
					}
					
					
				}
				
				if(flag)
				{System.out.println(num);
					
				}
			}
			
		}
	
		
	}

}
