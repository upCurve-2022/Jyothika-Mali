import java.util.Scanner;
public class Avgofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        float avg=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            arr[i]=x;
            avg+=arr[i];
        }
        System.out.println("Average of all array elements:"+avg/n);
    }
}
