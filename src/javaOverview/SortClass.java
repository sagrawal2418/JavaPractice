package javaOverview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortClass 
{
	public static void main(String[] args){
		
		List<ModelClass> watchlist = new ArrayList<ModelClass>();
		List<ModelClass2> charts = new ArrayList<ModelClass2>();
		List<ModelClass2> newList = new ArrayList<ModelClass2>();
		
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(20,"IBM")); 
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(45,"HSBC")); 
		watchlist.add(new ModelClass(11,"NFLX")); 
		watchlist.add(new ModelClass(11,"ABCD"));
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(10,"SD")); 
		
		charts.add(new ModelClass2("hello","IBM")); 
		charts.add(new ModelClass2("HELLO2","HSBC")); 
		charts.add(new ModelClass2("three","NFLX")); 
		charts.add(new ModelClass2("four","AAPL")); 
		charts.add(new ModelClass2("five","SD")); 
		
		int ind,found;
		
		for(int i = 0; i<watchlist.size(); i++){
			 ind=-1;
			 found=0;
			
			for(int j = 0; j<charts.size();j++){
				
				if(watchlist.get(i).getSymbol()==charts.get(j).getSymbol())
				{
					ind=j;
					 found=1;
					 break;
				}
			}
			
			if(found==1)
			{
				newList.add(charts.get(ind));
				charts.remove(ind);
			}
			else {
				newList.add(null);
			}
			
		}
		
		System.out.println("watchlist");
		for(int i = 0; i<watchlist.size(); i++){
			System.out.println(watchlist.get(i).getSymbol());
		}
		System.out.println("newList");
		for(int i = 0; i<newList.size(); i++){
			if(newList.get(i)==null)
			{
				System.out.println("null");
			}
			else{
				System.out.println(newList.get(i).getSymbol());
			}
			
		}
		
		
	}

}
