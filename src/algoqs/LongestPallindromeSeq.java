package algoqs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestPallindromeSeq 
{
	
	public static boolean isPM(String input){
		
		String newValue = "";
		
for(int i=input.length()-1; i>=0; i--){
			
	newValue = newValue+input.charAt(i);

			
		}

if(newValue.equals(input)){
	return true;
}
		
		
		return false;
	}
	
	public static void nonSequentialLongPallin(String input)
	{
		
		List<String> list = new ArrayList<String>();
		for(int i=0; i<input.length(); i++){
			
			list.add(input.charAt(i)+"");
			
			
		}
		
		Collections.sort(list);
		
		System.out.println(""+list.toString());
		
		int oddSize = 0;
		int maxSize = 0;
		int c=0;
		
		for(int i = 0; i<list.size(); i++){
			c=1;
			for(int j =i+1; j<list.size(); j++){
				
				if(list.get(i).equals(list.get(j))){
					
					c++;
				}
				else
				{
					break;
				}
				
			}
			i=i+c-1;
			if(c%2==0)
			{
				maxSize=maxSize+c;
			}
			else if(c%2 ==1 && oddSize ==0){
				
				maxSize = maxSize +c;
				oddSize++;
			}else if(c%2 ==1 && oddSize>0){
				
				maxSize = maxSize +(c-1);
			}
			
		}
		System.out.print("longet count "+maxSize);
	}
	
			
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		String input  = sc.next();
		
		int max_size = 1; 
		String max_word = input.charAt(0)+"";
		String pm = "";
		for(int i=0; i<input.length(); i++){
			
			pm = input.charAt(i)+"";
			
			for(int j = i+1; j<input.length(); j++){
				
				pm = pm+input.charAt(j);
				
				if(isPM(pm)){
					
					int s=j-i+1;
					if(max_size<s){
						max_size = s;
						max_word = pm;
					}
				
				}
				
			}
			
		}
		
		System.out.println("Largest palindrome is "+max_word);
		nonSequentialLongPallin(input);
		
	}

}
