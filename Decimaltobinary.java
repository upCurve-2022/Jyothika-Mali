//converting a decimal number to binary.
import java.util.Scanner;
public class Decimaltobinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=n;
        String str=" ";
        String str1=" ";
        while (n>0){
            str1=String.valueOf(n%2);
            str=str1.concat(str);
            n=n/2;
        }
        System.out.print("Binary form of "+a+" is "+str);
    }
}
