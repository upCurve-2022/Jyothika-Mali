import java.util.Scanner;
public class Numbersinwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n= sc.nextInt();
        display(n);
    }

    private static void display(int n) {
        int m=0,rem=0,num1=n;
        while (num1>0)
        {
            rem=num1%10;
            m++;
            num1=num1/10;
        }
        int rem1=0,k=0;
        String[] digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr= new String[m];
        while(n>0)
        {
            rem1=n%10;
            arr[k]= digits[rem1];
            k++;
            n=n/10;
        }
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
