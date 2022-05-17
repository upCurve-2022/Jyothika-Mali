import java.util.Scanner;
public class Perfectsquareornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if(Math.sqrt(n)-((int)Math.sqrt(n))==0.0){
            System.out.println(n+" is a perfect square");
        }
        else{
            System.out.println(n+" is not a perfect square");
        }
    }
}
