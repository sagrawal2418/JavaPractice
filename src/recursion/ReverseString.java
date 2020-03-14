package recursion;

public class ReverseString 
{
	
	public static void main(String args[]){
		
		String input = "abcde";
		String inp="";
		
		for(int i =0; i<input.length(); i++){
			
			inp=input.charAt(i)+inp;
		}
		
		System.out.println(reverseStr(input,"",0));
	}
	
	
	public static String reverseStr(String inp,String t,int ind)
	{
		if(inp.length()==ind){
			
			return t;
		}else{
			
			
			return reverseStr(inp,inp.charAt(ind)+t,ind++);
		}
	}

}

