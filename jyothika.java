import java.util.Scanner;
public class jyothika
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
                int a,b;
                System.out.println("Enter a and b:");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("before swapping:"+a+" "+b);
                a=a+b;
                b=a-b;
                a=a-b;
                System.out.println("after swapping:"+a+" "+b);
    }

}

