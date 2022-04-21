//printing n terms of sequence 1,-2,4,-6,7,-10,10,-14,......
import java.util.Scanner;
public class Sequence9 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n= sc.nextInt();
            int i=1;
            int j=2;
            System.out.print(i+" ");
            System.out.print(-j+" ");
            int count=3;
            while(count<=n)
            {
                if(count%2!=0){
                    i=i+3;
                    System.out.print(i+" ");
                    count++;
                }
                else{
                    j=j+4;
                    System.out.print(-j+" ");
                count++;
            }
        }
    }

}
