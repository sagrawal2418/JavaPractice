package javaOverview;

public class ModelClass
{
	
	int age ;
	String symbol;
	ModelClass(int age,String symbol)
	{
		setAge(age);
		setSymbol(symbol);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

}
