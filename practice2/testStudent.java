package practice2;

public class testStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Daniyal",50); 
		Student s2 = new Student("Goliaf",60);
		s1.yearsIncrement();
		s1.printer();
		s2.printer();
	}
}
