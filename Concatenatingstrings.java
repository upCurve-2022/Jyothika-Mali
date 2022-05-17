import java.util.Scanner;
public class Concatenatingstrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string1");
        String s1=sc.nextLine();
        System.out.println("Enter a string2");
        String s2=sc.nextLine();
        System.out.println("Concatenated string:"+s1.concat(s2));
    }
}
