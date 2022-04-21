import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        x=sc.nextInt();
        System.out.println("Enter 2nd number:");
        y=sc.nextInt();
        System.out.println("Enter 3rd number:");
        z=sc.nextInt();
        if(z>x && z>y)
        System.out.println(z+ " is the largest\n"+Math.max(x,y)+ " is the 2nd largest");
        else if(y>x && y>z)
        System.out.println(y+ " is the largest\n"+Math.max(x,z)+ " is the 2nd largest");
        else
        System.out.println(x+ " is the largest\n"+Math.max(y,z)+ " is the 2nd largest");
    }
}
