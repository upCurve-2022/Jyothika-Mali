import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        while (n>0){
            int d=n%10;
            sum+=(d*d*d);
            n=n/10;
        }
        if(sum==m){
            System.out.println(m+" is a armstrong number");
        }
        else {
            System.out.println(m+" is not a armstrong number");
        }
    }
}
