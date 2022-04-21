import java.util.Arrays;
import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            int j= sc.nextInt();
            arr[i]=j;
        }
        Arrays.sort(arr);
        System.out.println("Enter the key value:");
        int k= sc.nextInt();
        int count=0;
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]>k){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(arr[mid]<k){
                low=mid+1;
                mid=(low+high)/2;
            }
            else if(arr[mid]==k){
                System.out.println("Element found at index:"+mid);
                count++;
                low=high+1;
            }
        }
        if(count!=0){
            System.out.println("Element not found");
        }
    }
}
