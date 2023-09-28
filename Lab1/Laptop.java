package Lab1;
public class Laptop{
	public enum Lineup{
		 	Ideapad,Thinkpad,Legion,Yoga,Flex,Chromebook
	}
	public static final String brand="Lenovo";
	public Lineup lineup;
	public static int warantyInMonths;
	private int cost;
	private String OS;
	
	{
		lineup=Lineup.Ideapad;
		warantyInMonths = 6;
		cost=0;
		OS="MS DOS";
	}
	public Laptop() {}
	public Laptop(int cost, int waranty, Lineup lineup,String OS) {
	this.cost=cost;
	this.lineup=lineup;
	this.OS = OS;
	}
	
	public int getCost() {
		return cost;
	}
	
    public int getCost(int discount) {
    	return cost-(cost*discount)/100;
    }
    public void setLineup(Lineup lineup) {
    	this.lineup=lineup;
    }
    public void setWaranty(int warranty) {
    	Laptop.warantyInMonths=warranty;
    }
    public void setCost(int cost) {
    	this.cost=cost;
    }
    public void setOS(String OS) {
    	this.OS=OS;
    }
    public void printValues() {
    System.out.println(toString());	
    }
    
    public String toString(){
    	return "Brand "+brand+"lineup "+lineup+"Warranty "+warantyInMonths+"Cost "+cost+"OS "+OS;
    }
}  

