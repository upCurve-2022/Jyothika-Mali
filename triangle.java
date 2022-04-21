import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        int n=5;
        int a=n;
        int b=n;
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=((n*2)-1);j++)
            {
                if((i+j)%2==0 &&j>=a && j<=b)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            a--;
            b++;
            System.out.print("\n");
        }
    }

}
