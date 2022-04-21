//printing n terms of sequence -1,2,-3,4,-5,6,-7..........
import java.util.Scanner;
public class Sequence2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            else
            {
                System.out.print(-i+" ");
            }
        }
    }
}
