package Lab1;

import Lab1.Person.Gender;


public class TestDragonLunch {
	  public static void main( String args[]) {
		Person b1= new Person("b1",Gender.Boy);
		Person g1= new Person("g1",Gender.Girl);
		Person b2= new Person("b2",Gender.Boy);
		Person g2= new Person("g2",Gender.Girl);
		Person b3= new Person("b3",Gender.Boy);
		Person g3= new Person("g3",Gender.Girl);
		
		DragonLunch dragon = new DragonLunch();
		
		dragon.kidnapp(b1);
		dragon.kidnapp(b2);
		dragon.kidnapp(b3);
		dragon.kidnapp(g1);
		dragon.kidnapp(g2);
		dragon.kidnapp(b1);
		dragon.kidnapp(g3);
		dragon.kidnapp(g3);
		dragon.willDragonEatOrNot();
	  }
}
	