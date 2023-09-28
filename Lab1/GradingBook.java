package Lab1;
import java.util.Scanner;
import java.util.Vector;
import practice2.Student;

public class GradingBook{
	public Course course;
	int sum;
	Student max=new Student("max",0);
	Student min=new Student("min",101);
	
	Vector<Student> vector = new Vector<>();
	int[] count = new int[11];
	
	public GradingBook() {}
	
	public GradingBook(Course course) {
		this.course=course;
		displayMessage();
	}	
	
	public void enterMarks() {
		for(int i=0;i<=10;i++) {
			count[i]=0;
		}
		System.out.println("Please input grades for Students: \n");	
		Scanner sc =new Scanner(System.in);
	  	System.out.println("Student:");
	  	while (sc.hasNext()) { 
        	System.out.println("Student:");
			String name = sc.next();
			if (name.equals("exit")) break;
			int mark = sc.nextInt();
			sum+=mark;
			int index=mark/10;
			count[index]+=1;
			vector.add(new Student(name,mark));
		}	
		sc.close();
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for "+this.course.getDescription()+"!"+"\n");
	}
	public void diplayGradeReport() {
		System.out.println(characterisitc());
		System.out.println("Grades distribution: \n");
		System.out.println(OutputBarChart());
	}
	
	public String OutputBarChart() {	
		String s="";
		int startrange=0;
	
		for(int i=0;i<11;i++) {
			int element=count[i];
			int endrange=startrange+9;
			if(i==10) {
				s+=String.format("%02d:",startrange);
				s+=stars(element);
				break;
			}else {
			s+=String.format("%02d-%02d:",startrange,endrange);
			s+=stars(element);
			}
			s+='\n';
			startrange+=10;
		}
		return s;
	}
	
	public String characterisitc() {
		return this.toString(determineAverage(),determinMax(),determinMin());
	}
	
	public double determineAverage() {
		Data data =new Data();
		double average = data.average(sum, this.vector.size());
		return average;
	}
	
	public Student determinMax() {
		for(Student element:vector) {
			if(element.getMark()>max.getMark()) {
				max=element;
			}
		}
		return max;
	}
	
	public Student determinMin() {
		for(Student element:vector) {
			if(element.getMark()<min.getMark()) {
				min=element;
			}
		}
		return min;
	}
	
	public String toString(double num,Student maximal,Student minimal ) {
		return "Class average is "+ num + ". " + "Lowest grade is " + minimal.getMark() + 
				"(Student "+minimal.getName()+", id:" + (minimal.getId()-2) + ")." + "\n" +
				"Highest grade is " + maximal.getMark()+ "(Student "+maximal.getName()+
				", id:" + (maximal.getId()-2) + ")."; 
	}
	
	public String stars(int num) {
		String s="";
		if (num == 0) {
            s+=" ";
        } else {
            for (int j = 0; j < num; j++) {
               s+="*";
            }
            s+=" ";
        }
		return s.toString();
	}
}
	
