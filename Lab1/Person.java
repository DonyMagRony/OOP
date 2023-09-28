package Lab1;
public class Person {
	public enum Gender{
		Boy,Girl
	}
	private final Gender gender;
	public Person() {
		this.gender = null;
	}
	public Person(String name,Gender gender) {
		this.gender=gender;
	
	}
	public Gender getGender(){
		return this.gender;
	}
	public String toString(){
		return"";
	}
}