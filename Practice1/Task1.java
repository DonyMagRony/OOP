package Practice1;
import java.util.*;

public class Task1 {
  public static void main( String args[]) {
	  
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter ur name");
    
    String str=sc.nextLine();
    int count = str.length();
    
    System.out.print("+");
    
    String str1="-";
    System.out.print(str1.repeat(count));
    
    System.out.println("+");
    
    System.out.println("|"+str+"|");

    System.out.print("+");
    System.out.print( str1.repeat(count) );
    System.out.print("+");
    
    sc.close();
  }
}