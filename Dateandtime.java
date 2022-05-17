import java.util.Date;
import java.util.Scanner;
import java.time.*;
public class Dateandtime {
    public static void main(String[] args){
        Date date_Time=new Date();
        System.out.println("Current date and time:"+date_Time);
        System.out.println("Current date and time:"+LocalDateTime.now());
        System.out.println("Current date:"+LocalDate.now());
        System.out.println("Current time:"+LocalTime.now());
    }
}
