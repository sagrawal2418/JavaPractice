package javaOverview;

import java.util.ArrayList;
import java.util.List;

public class Sort3 
{
public static void main(String[] args){
		
		List<ModelClass> watchlist = new ArrayList<ModelClass>();
		List<ModelClass2> charts = new ArrayList<ModelClass2>();
		List<ModelClass> newList = new ArrayList<ModelClass>();
		
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(20,"IBM")); 
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(16,"SD")); 
		watchlist.add(new ModelClass(45,"HSBC")); 
		watchlist.add(new ModelClass(11,"NFLX")); 
		watchlist.add(new ModelClass(17,"SD")); 
		watchlist.add(new ModelClass(11,"ABCD"));
		watchlist.add(new ModelClass(31,"AAPL")); 
		watchlist.add(new ModelClass(10,"SD")); 
		
		charts.add(new ModelClass2("hello","IBM")); 
		charts.add(new ModelClass2("HELLO2","HSBC")); 
		charts.add(new ModelClass2("three","NFLX")); 
		charts.add(new ModelClass2("four","AAPL")); 
		charts.add(new ModelClass2("five","SD")); 
		
		List<String> symbolList = new ArrayList<String>();
		
		for(int i = 0; i<watchlist.size(); i++)
		{
			symbolList.add(watchlist.get(i).getSymbol());
		}
		
		List<String> symbolListSmall = new ArrayList<String>();
		
		for(int i = 0; i<symbolList.size(); i++)
		{
			if(!(symbolListSmall.contains(symbolList.get(i))))
			{
				symbolListSmall.add(symbolList.get(i));
				newList.add(watchlist.get(i));
			}
			
		}
		
		
		
		//Printing
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
