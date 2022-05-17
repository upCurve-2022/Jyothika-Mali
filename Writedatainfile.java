import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Writedatainfile {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fname=sc.nextLine();
        FileOutputStream fos=new FileOutputStream(fname,true);
        System.out.println("Enter the content to be written:");
        String data=sc.nextLine();
        byte[] b=data.getBytes();
        fos.write(b);
        System.out.println("data written into the file");
        fos.close();
    }
}
