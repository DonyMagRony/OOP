package Lab1;
public class TestGradingBook{
	public static void main( String args[]) {
		Course CS101 = new Course("CS101","Object-oriented programming and Design",5,"CS000");
		GradingBook GB= new GradingBook(CS101);
		GB.enterMarks();
		GB.diplayGradeReport();
		
	}
}