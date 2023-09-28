package practice2;

public class Student {
	private static int id;
	private int studID;
	private String name;
	private int mark ;
	private int age;
	int yearOfStudy=1;
	public Student() {
		
	}
	public Student( String name,int mark) {
		Student.id++;
		this.studID=id;
		this.name = name;
		this.mark=mark;
	}
	public int getAge() {
		return age;
	}
	public int getMark() {
		return mark;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	public int getId() {
		return this.studID;
	}
	public void setId(int id) {
		this.studID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void yearsIncrement() {
		this.yearOfStudy++;
	}
	
	public String toString() {
		return this.getId()+" "+this.getName()+ " "+this.yearOfStudy;
	}
	public void printer() {
		System.out.println(this.toString());
	}
}
