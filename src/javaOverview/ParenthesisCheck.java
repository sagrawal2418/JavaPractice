package javaOverview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

a=(5+2)-6


5+2(

)5+2(
))))

 */

public class ParenthesisCheck 
{
	public static void main(String []args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter expression");
		
		String input = s.next();
		char lastInput;
		
		List<String> list = new ArrayList<String>() ;
		
		boolean valid = true;
		
		char ch;
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			
			if(input.charAt(i) == '(' || input.charAt(i)==')'){
				String h=""+input.charAt(i);
				
				System.out.println(list.toString());
				if(h.equals("(")){
					list.add(h);
				}else if(h.equals(")")){
					
					if(list.size()>0){
						String ff=list.get(list.lastIndexOf("("));
						System.out.println("ff="+ff);
						if(ff.equals("(")){
							list.remove(list.lastIndexOf("("));
						}
						else{
							System.out.println(i);
							valid = false;
							break;
						}
					}
					else
					{
						System.out.println(i);
						valid = false;
						break;
					}
					
				}
				
			
				
				
			}
			
		}
		if(list.size()==0)
		{
			System.out.println("This expression is "+valid);
		}
		else
		{
			System.out.println("This expression is not valid");
		}
		
			
		
		
	}

}
