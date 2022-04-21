//printing n terms of sequence 1,4,9,16,25..........
import java.util.Scanner;
public class Sequence5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int n1 = (int) Math.pow(i, 2);
                System.out.print(n1 + " ");
            }
        }
}
