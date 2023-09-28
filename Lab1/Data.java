package Lab1;

import java.util.Scanner;

public class Data{
	private double max;
	private double sum;
	private int counter;
	public Data() {}
	
	public void add() {
    	Scanner sc =new Scanner(System.in);
	    while (true) {
	    	System.out.println("Enter nummber (Q to quit):");
	    	String input = sc.nextLine().strip();
	    	if(input.equals("Q"))
	    		break;
	    	double value = Double.parseDouble(input);
	    	this.add(value);
	    }	
	    sc.close();
	}
	
	public void add(double add1) {
		counter+=1;
		sum+=add1;
		max=this.max(add1,counter);
	
	}
	
	public double getMax() {
		return max;
	}
	public double max(double value,int count) {
		if(count==1) {
			max=value;
			return max;
		}
		if(max<value) 
			max=value;
		return max;
	}
	public double average(double value,int number) {
		return value/number;
	}
	public void output() {
		System.out.println(toString());
	}
	public String toString() {
		return "Average: "+average(this.sum,this.counter)+'\n'+"Max: "+this.getMax();
	}
}