//printing n terms of sequence 1,5,13,29,49..........
import java.util.Scanner;
public class Sequence6 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n= sc.nextInt();
            int i=1;
            int count=2;
            int j=1;
            System.out.print(i+" ");
            while(count<=n)
            {
                if(j%3!=0){
                     int num=i+(4*j);
                     i=num;
                System.out.print(num+" ");
                count++;
            }
                j++;
        }
    }
}
