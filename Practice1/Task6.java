package Practice1;
import java.util.*;

public class Task6  {
  public static void main( String args[]) {
    Scanner sc =new Scanner(System.in);
    
    System.out.print("Enter word:");
    
    String s = sc.nextLine();
    String str=s.strip();   
  
    if (IsPalindrome(str)){
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
    sc.close();
  }
  
  public static boolean IsPalindrome (String word) {
	  
	  String reverseStr = "";
	  
	  int strLength = word.length();
	  	
	  for (int i = (strLength - 1); i >=0; --i) 
	      reverseStr = reverseStr + word.charAt(i);
	  	
	  return word.toLowerCase().equals(reverseStr.toLowerCase()) ;
   }
}