import java.util.Locale;
import java.util.Scanner;
public class Stringtouppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("uppercase:"+s.toUpperCase());
    }
}
