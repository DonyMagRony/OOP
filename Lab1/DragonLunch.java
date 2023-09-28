package Lab1;
import java.util.Vector;
import Lab1.Person.Gender;
public class DragonLunch{
	
	int boys;
	int girls;
	
	Vector<Person> vector=new Vector<>();
	public void kidnapp(Person P) {
		vector.add(P);
		if(P.getGender()==Gender.Girl) {
			if(girls<boys) girls++;
			
		}else boys++;
	}
	
	public DragonLunch() {}
	public void willDragonEatOrNot() {
		if(vector.size()%2==1 || vector.size()!=boys+girls || boys!=girls){
			System.out.println("Yes,tasty");
		}
		else {
			System.out.println("Noo..");
		}
	}
}