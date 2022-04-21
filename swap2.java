import java.util.Scanner;
public class swap2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a,b,c:");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        System.out.println("before swapping:"+a+" "+b+" "+c);
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("before swapping:"+a+" "+b+" "+c);
    }
}
