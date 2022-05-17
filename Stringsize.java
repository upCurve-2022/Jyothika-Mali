import java.util.Scanner;
public class Stringsize {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("String length is:"+l);
    }
}
