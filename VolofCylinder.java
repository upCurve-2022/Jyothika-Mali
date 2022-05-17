import java.util.Scanner;
public class VolofCylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        float r= sc.nextFloat();
        System.out.println("Enter height:");
        float h= sc.nextFloat();
        double v=3.14*r*h;
        System.out.println("Volume of cylinder:"+v);
    }
}
