package Lab1;

import Lab1.Laptop.Lineup;

public class TestLaptop {
	  public static void main( String args[]) {
		  Laptop laptop1=new Laptop();
		  Laptop laptop2=new Laptop(300000,9,Lineup.Flex,"Ubunta");
		  System.out.println( laptop2.getCost());
		  System.out.println(laptop2.getCost(30));
		  laptop2.setOS("Windows");
		  laptop2.printValues();
		  laptop1.printValues();
	  }
}