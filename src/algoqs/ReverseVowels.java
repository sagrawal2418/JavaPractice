package algoqs;
/*
Umbrella
U e a

ambrellU
//
 * adtu
 * 
s=aeu;
umbrella



 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseVowels 
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String updated="";
		
		List<String> vowels =new ArrayList<String>();
		vowels.add("e");
		vowels.add("a");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		String v="";
		
		for(int i=0; i<input.length(); i++){
		String vv=input.charAt(i)+"";
		vv=vv.toLowerCase();
			if(vowels.contains(vv))
			{
				v = input.charAt(i)+v;
			}
			
		}
		int a=0;
		for(int j =0; j<input.length(); j++){
			String vv=input.charAt(j)+"";
			vv=vv.toLowerCase();

			if(vowels.contains(vv)){
				
				updated = updated + v.charAt(a);
				a++;
			}else{
				
				updated = updated + input.charAt(j);
			}
			
			
		}
		
		System.out.println("Updated string is "+updated);
		
	}

}
