package javaOverview;

import java.util.ArrayList;
import java.util.List;

public class SortClass1
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
		
		List<String> symbolList = new ArrayList<String>();
		
		for(int i = 0; i<charts.size(); i++)
		{
			symbolList.add(charts.get(i).getSymbol());
		}
		
		int ind;
		for(int i = 0; i<watchlist.size(); i++){
			
			ind =-1;
			if(symbolList.contains(watchlist.get(i).getSymbol()))
			{
				ind=symbolList.indexOf(watchlist.get(i).getSymbol());
				newList.add(charts.get(ind));
				charts.remove(ind);
				symbolList.remove(ind);
			}
			else
			{
				newList.add(null);
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
