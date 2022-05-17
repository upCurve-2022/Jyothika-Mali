import java.io.File;
import java.io.IOException;
public class Createfile {
    public static void main(String[] args) throws IOException
    {
        File f=new File("Java assignment.txt");
        if(f.createNewFile()){
            System.out.println("File is created");
        }
        else{
            System.out.println("File already exists");
        }
    }
}
