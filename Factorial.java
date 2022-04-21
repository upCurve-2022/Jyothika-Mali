//To find thev factorial of the given number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int fact=1;
        int i=n;
        while(n>0){
            fact=fact*n;
            n=n-1;
        }
        System.out.println("Factorial of "+i+" is "+fact);
    }
}
