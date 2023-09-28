package Practice1;
import java.util.*;

public class Task4 {
  public static void main( String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter nums");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("First root:"+First(a,b,c));
    System.out.println("Second root"+Second(a,b,c));
    sc.close();
  }
    public static double First(int a,int b,int c){
    	double x=(-b+Math.sqrt(a))/(2*c);
    	return x;
    	}
    
    public static double Second(int a,int b,int c) {
     return (-b-Math.sqrt(a))/(2*c);
    	}  
    
  
}