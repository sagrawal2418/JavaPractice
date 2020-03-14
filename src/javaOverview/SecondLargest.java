package javaOverview;

import java.util.Scanner;

public class SecondLargest 
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("Enter the size of the array.");
		int size = console.nextInt();
		int k = 0;
		int array[] = new int [size];
		for(k = 0; k < size; k++)
		{
			System.out.println("Enter the element value no ."+(k+1)+":");
			array[k] = console.nextInt();
		}
		
		
		int lar=array[0];
		int snd_lar = array[0];
		for(k = 0; k<size; k++){
		
			
			if(lar < array[k])
			{
				snd_lar = lar;
				lar = array[k];
				 
			}else if(snd_lar<array[k]){
				snd_lar = array[k];
				
				
			}
			
		
			
		}
		
		System.out.println(snd_lar);
		
	}
		}


