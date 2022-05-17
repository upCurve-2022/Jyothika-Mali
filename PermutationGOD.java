import java.util.Scanner;
public class PermutationGOD {
    public static void printPermutationGOD(String s){
        int len=s.length();
        int no_of_permutations=factorial(len);
        for (int i=0;i<no_of_permutations;i++){
            StringBuilder s1=new StringBuilder(s);
            int temp=i;
            for(int divisor=len;divisor>=1;divisor--){
                int x=temp/divisor;
                int index=temp%divisor;
                System.out.print(s1.charAt(index));
                s1.deleteCharAt(index);
                temp=x;
            }
            System.out.println();
        }
    }
    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n = n - 1;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s= sc.next();
        printPermutationGOD(s);
    }
}
