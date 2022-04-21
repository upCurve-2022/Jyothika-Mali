import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            int j= sc.nextInt();
            arr[i]=j;
        }
        System.out.println("Enter the value:");
        int k= sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++) {
            int x = arr[i];
            if (x == k) {
                c++;
                System.out.println(k + " is found at the index " + i);
                break;
            }
        }
            if(c==0){
                System.out.println(k+"is not found");
            }
    }
}
