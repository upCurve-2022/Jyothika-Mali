import java.util.Scanner;
public class Sumoddeven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        int sumodd=0;
        for (int i=1;i<=n;i+=2)
        {
            sumodd+=i;
        }
        int sumeven=0;
        for (int i=0;i<=n;i+=2)
        {
            sumeven+=i;
        }
        System.out.println("Sum of odd numbers:"+sumodd);
        System.out.println("Sum of even numbers:"+sumeven);
    }
}
