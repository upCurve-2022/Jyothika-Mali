import java.util.Locale;
import java.util.Scanner;
public class RemoveOccourences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String");
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder(String.valueOf(s));
        System.out.println("Enter a character");
        String c=sc.next();
        c=c.toLowerCase();
        String c1=c.toUpperCase();
        int x=s1.length();
        for (int i=0;i<x;i++){
            if(s1.charAt(i)==c.charAt(0)||s1.charAt(i)==c1.charAt(0)){
                s1.delete(i,i+1);
                i=i-1;
                x=s1.length();
            }
        }
        System.out.println("String after removing occourences of"+c+"is"+s1);
    }
}
