//printing n terms of sequence 1,-2,6,-15,31,-56,..........
import java.util.Scanner;
public class Sequence7 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n= sc.nextInt();
            int j=1;
            for(int i=0;i<=n-1;i++){
                if(i%2!=0)
                {
                    int m=j+(i*i);
                    j=m;
                    System.out.print(-m+" ");
                }
                else
                {
                    int m=j+(i*i);
                    j=m;
                    System.out.print(m+" ");
                }
            }
        }
    }
