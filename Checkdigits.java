import java.util.Scanner;
public class Checkdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String");
            String s=sc.nextLine();
            int l=s.length();
            int count=0;
            for(int i=0;i<l;i++){
                char x=s.charAt(i);
                if(Character.isDigit(x)){
                    count++;
                }
            }
            if(count==l){
                System.out.println("String contains only digits");
            }
            else{
            System.out.println("String doesn't contain only digits");
        }
    }
}
