package effigo.ayushi.assignment.dateconversion;



import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Assignment1 {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        String date = "29-01-2024 01:00";

        // String to date conversion

        Date parsedDate =  sdf.parse(date);
        System.out.println(parsedDate);

        // date to unix timestamp
        
        long unixTime = parsedDate.getTime();
        System.out.println(unixTime);

        // local timestamp to UTC timestamp
        
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("UTC conversion is: " + sdf.format(parsedDate));

        // UTC timestamp to local timestamp
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println("ITC conversion is: " + sdf.format(parsedDate));
    }
}
