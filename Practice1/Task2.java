package Practice1;
import java.util.*;

public class Task2 {
  public static void main( String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter num");
    int l = sc.nextInt();
    int p =l*4; 
    int s=l*l;
    double d=Math.sqrt(2*l);
    System.out.println(s+" "+p+" "+d); 
    sc.close();
  }
}