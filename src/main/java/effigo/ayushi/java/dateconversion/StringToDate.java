package effigo.ayushi.java.dateconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate{
    public static void main(String[] args) throws ParseException{

        //format we want
        DateFormat mSDF = new SimpleDateFormat("hh:mm a");

        //format thats actually present.
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");

        String date = "29-01-2024 01:00";
        System.out.println(mSDF.format(sdf.parse(date)));
    }
}