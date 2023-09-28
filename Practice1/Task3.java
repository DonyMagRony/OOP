package Practice1;
import java.util.*;


public class Task3 {
  public static void main( String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter num: ");
    int score = sc.nextInt();
    if(isBetween(score,95,100)) {
    	System.out.println("A");
    }else if(isBetween(score,90,100)){
    	System.out.println("-A");
    }else if(isBetween(score,85,90)) {
    	System.out.println("+B");
    }else if(isBetween(score,80,85)) {
    	System.out.println("B");
    }else if(isBetween(score,75,80)) {
    	System.out.println("-B");
    }else if(isBetween(score,70,75)) {
    	System.out.println("+C");
    }else if(isBetween(score,65,70)) {
    	System.out.println("C");
    }else if(isBetween(score,60,65)) {
        	System.out.println("-C");
    }else if(isBetween(score,50,60)) {
        	System.out.println("D");
    }else {
    	System.out.println("Retake");
    	sc.close();
    }
  }
 
  private static boolean isBetween(int score, int i, int j) {
	    return i <= score && score <= j;
	  }
}

