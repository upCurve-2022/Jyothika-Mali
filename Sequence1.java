//printing n terms of sequence 4,16,36,64,..........
import java.util.Scanner;
public class Sequence1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n= sc.nextInt();
        int num;
        int j=2;
        int count=1;
        while(count<=n)
        {
            num=j*j;
            System.out.println(num+" ");
            count++;
            j+=2;
        }
    }
}
