package Lab1;
public class Course{
	private String name;
	private String descriprtion;
	private int numberOfCredits;
	private String Prerequisits;
	public Course() {
		
	}
	public Course(String name,String descriprtion,int numberOfCredits, String Prerequisits) {
		this.name=name;
		this.descriprtion=descriprtion;	
		this.numberOfCredits=numberOfCredits;
		this.Prerequisits=Prerequisits;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.descriprtion;
	}
	public int getNumberOfCredits() {
		return this.numberOfCredits;
	}
	public String getPrerequisits() {
		return this.Prerequisits;
	}
	public String toString() {
		return this.getName()+" "+this.getDescription(); 
	}
	
}