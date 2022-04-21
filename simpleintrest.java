import java.util.Scanner;
public class simpleintrest {
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p= sc.nextInt();
        System.out.println("Enter time:");
        int t= sc.nextInt();
        System.out.println("Enter rate:");
        int r= sc.nextInt();
        float SimpleIntrest=(p*t*r)/100;
        System.out.println("simple intrest is::"+SimpleIntrest);
    }
}
