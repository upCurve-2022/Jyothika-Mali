import java.util.Scanner;
public class pyramid {
    public static void main(String[] args)
    {
        int p=5;
        for(int i=0;i<p;i++) {
            for (int j = 0;j <= i;j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}