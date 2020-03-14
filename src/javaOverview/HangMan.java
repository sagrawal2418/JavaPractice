package javaOverview;

import java.util.Scanner;

/*

 */

public class HangMan 
{
	
	public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	
	String guessWord = "HELLO";
	int l=guessWord.length();
	String word="";
	
	for(int i=0;i<l; i++){
		
		word = word+"-";
	}
	
	StringBuilder wordw=new StringBuilder(word);
	StringBuilder guessWordw=new StringBuilder(guessWord);
	System.out.println("There are total of"+l+"characters in this word");
	while(!wordw.equals(guessWordw))
	{
		System.out.println("Please enter your character");
		char input = in.next().charAt(0);
		
		
		for(int i =0; i<l; i++){
			
			if(guessWord.charAt(i)==input  &&  wordw.charAt(i)!=guessWord.charAt(i)){
				
				
				wordw.setCharAt(i,input);
				break;
			}
			
			
	}
		System.out.println(wordw);
		System.out.println(guessWordw+"      "+wordw);
		

	}
}}