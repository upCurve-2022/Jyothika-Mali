//printing n terms of sequence 1,4,7,12,23..........
import java.util.Scanner;
public class Sequence4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n= sc.nextInt();
        int i=1;
        int j=4;
        int k=7;
        System.out.print(i+"\n"+j+"\n"+k+"\n");
        int count=4;
        while(count<=n)
        {
             int num=i+j+k;
             i=j;
             j=k;
             k=num;
            System.out.println(num+" ");
            count++;
        }
    }
}

