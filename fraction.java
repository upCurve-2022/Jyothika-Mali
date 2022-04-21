import java.util.Scanner;
public class fraction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter a number:");
        double fractional_part = a % 1;
        double integral_part = a - fractional_part;
        System.out.println("Integer part:" + integral_part);
        System.out.println("Fraction part:" + fractional_part);
    }
}
