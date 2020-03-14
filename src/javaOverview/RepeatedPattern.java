package javaOverview;

import java.util.Scanner;

public class RepeatedPattern 
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String pattern = "";
		int l=input.length();
		boolean flag=true;
		
		for(int i =0; i<l/2; i++){
			
			 pattern = pattern+input.charAt(i);
			 System.out.println("main "+pattern);
			 //pattern=input.substring(0, i+1)
			int l1=i+1;
			
			 if(l%l1 == 0){
				 flag=true;
				 for(int j=0; j<l;j=j+l1 ){
					 String ss=input.substring(j,j+l1);
					 System.out.println("     sub "+ss);
					 if(!(pattern.equals(ss))){
						 flag = false;
						 break;
						 
					 }
					 
					 
					 
					 
				 }
				 
				 if(flag){
					 break;
				 }
				
			 }
			 else
			 {
				 flag=false;
			 }
			 
			 
			 
		
		}
		
		System.out.print(flag?"Here is your pattern "+pattern:"This pattern is not valid" );
		
	}

}
