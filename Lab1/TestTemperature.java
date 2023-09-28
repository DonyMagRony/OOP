package Lab1;
public class TestTemperature {
	public static void main( String args[]) { 
	Temperature temp1 = new Temperature();
	Temperature temp2 = new Temperature(17);
	Temperature temp3 = new Temperature('C');
	Temperature temp4 = new Temperature(25,'F');
	temp1.getFahrenheit();
	temp1.setAll(50, 'C');
	temp2.getFahrenheit();
	temp2.getCelsius();
	temp2.getCelsius();
	temp3.getFahrenheit();
	temp4.getCelsius();
	temp4.getFahrenheit();
	}	
}