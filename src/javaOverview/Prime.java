package javaOverview;

/*
20
 */
import java.util.Scanner;

public class Prime {
	public static void main(String [] args)
	{
		Scanner data = new Scanner(System.in);
		int n = data.nextInt();
		boolean prime=true;
		for(int i = 2; i<n; i++){
			
			if(n%i==0){
				
				prime=false;
				break;
				
			}
			
		
		}
		if(prime && n >1){
			System.out.println("It is prime number");

		}
		else{
			System.out.println("It is not prime number");
	}}
}
