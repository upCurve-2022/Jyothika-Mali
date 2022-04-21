//converting binary to decimal number.
import java.util.Scanner;
public class Binarytodecimal {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int a=n;
            int i=0;
            int dec=0;
            while (n>0){
                int d=n%10;
                int j=(int)Math.pow(2,i);
                dec+=d*j;
                i++;
                n=n/10;
            }
            System.out.print("Decimal form of "+a+" is "+dec);
        }
    }

