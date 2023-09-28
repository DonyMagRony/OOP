package Practice1;
import java.util.*;

public class Task5 {
  public static void main( String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter num");
    double initial = sc.nextInt();
    double interest= sc.nextInt();
    double result = initial+(initial*interest)/100;
    System.out.print(result);
    sc.close();
  }
}