//printing n terms of sequence 1,1,2,3,5,8,13,..........
import java.util.Scanner;
public class Sequence8 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n= sc.nextInt();
            int i=1;
            int j=1;
            System.out.print(i+"\n"+j+"\n");
            int count=3;
            while(count<=n)
            {
                int num=i+j;
                i=j;
                j=num;
                System.out.println(num+" ");
                count++;
            }
        }
    }
