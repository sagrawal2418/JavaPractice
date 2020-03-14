package javaOverview;

public class ModelClass2
{
	String name; ;
	String symbol;
	ModelClass2(String name,String symbol)
	{
		setName(name);
		setSymbol(symbol);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
