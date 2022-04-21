import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int revno =0;
        while (n > 0) {
            int num = n % 10;
            revno =(revno + num) * 10;
            n = n / 10;
        }
        revno = revno/10;
        System.out.println("Reverse number:" + revno);
    }
}
