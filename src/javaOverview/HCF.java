package javaOverview;

import java.util.Scanner;

/*
 * 18)WAP to find HCF or greatest common divisor of two numbers that are taken as input
For example :-
A=10
B=15

Hcf=5

250

100

50
5

50
10

250
100

c=100
99
break
lcm
lcm*hcf=product of two numbers 

lcm=a*b/hcf
 */
public class HCF
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int hcf = 0;
		int lcm=1;
		int c=0;
		int c1=0;
		if(input1>0 && input2>0){
			
			if(input1>input2){
				
				c=input2;
				c1=input1;
			}else{
				c = input1;
				c1=input2;
			}
			
			for(int i = c; i>=1; i--){
				
				if(input2 % i ==0 && input1 % i ==0){
					hcf =i;
					break;
				}
			}
			
			System.out.println(hcf);
		}
		
		
		for(int i =2; i<=c1; i++){
			
			if(input1 % i ==0 && input2 % i ==0){
				lcm = lcm *i;
				input1=input1/i;
				input2 = input2/i;
				while(input1 % i ==0 || input2 % i ==0 ){
					{
						if(input1 % i ==0 && input2%i==0){
							lcm = lcm *i;
							
							input1 = input1/i;
							input2=input2/i;
						}
						else if(input2%i==0)
						{
							lcm=lcm*i;
							input2=input2/i;
						}
						else if(input1%i==0)
						{
							lcm=lcm*i;
							input1=input1/i;
						}
						else if(input1 ==1 && input2 ==1){
							break;
						}
					}
				}
			}else if(input1 % i ==0){
				lcm = lcm *i;
				input1 = input1/i;
				while(input1 % i ==0 || input2 % i ==0 ){
					{
						if(input1 % i ==0 && input2%i==0){
							lcm = lcm *i;
							
							input1 = input1/i;
							input2=input2/i;
						}
						else if(input2%i==0)
						{
							lcm=lcm*i;
							input2=input2/i;
						}
						else if(input1%i==0)
						{
							lcm=lcm*i;
							input1=input1/i;
						}
						else if(input1 ==1 && input2 ==1){
							break;
						}
					}
				}
				
			}else if(input2 % i ==0){
				lcm = lcm * i;
				input2 = input2/i;
				while(input1 % i ==0 || input2 % i ==0 ){
					{
						if(input1 % i ==0 && input2%i==0){
							lcm = lcm *i;
							
							input1 = input1/i;
							input2=input2/i;
						}
						else if(input2%i==0)
						{
							lcm=lcm*i;
							input2=input2/i;
						}
						else if(input1%i==0)
						{
							lcm=lcm*i;
							input1=input1/i;
						}
						else if(input1 ==1 && input2 ==1){
							break;
						}
					}
				}
			}else if(input1 ==1 && input2 ==1){
				break;
			}
		}
		
		System.out.println("LCM="+lcm);
		
				
			}
		
	
		
	


}
