//check whether a given string is palindrome or not.
import java.util.Locale;
import java.util.Scanner;
public class Stringpalindrome{
 public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string:");
       String str=sc.nextLine();
       String a=str;
       StringBuilder s=new StringBuilder(str);
       s=s.reverse();
       String rs=String.valueOf(s);
       str=str.toLowerCase();
       rs=rs.toLowerCase();
       if (str.equals(rs)) {
           System.out.println(a + " is a palindrome");
       }
       else {
       System.out.println(a+"is a not a palindrome");
       }
      }
}