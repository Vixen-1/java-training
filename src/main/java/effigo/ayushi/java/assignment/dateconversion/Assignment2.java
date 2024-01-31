package effigo.ayushi.java.assignment.dateconversion;



import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) throws ParseException{        
        Scanner scan = new Scanner(System.in);
        String givenDate = scan.nextLine();

        //formatting date
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        //current date
        LocalDateTime currentDate = LocalDateTime.parse(givenDate,formatter);
        System.out.println("Current Date: "+ currentDate);

        //adding one day
        LocalDateTime incrementedDate = currentDate.plusDays(1);
        System.out.println("One day added: "+ incrementedDate);

        //subtracting 10 days
        LocalDateTime decrementDate = currentDate.minusDays(10);
        System.out.println("Decremented 10 days: "+decrementDate);

        //Adding an hour
        LocalDateTime oneHrsIncrementDate = currentDate.plusHours(1);
        System.out.println("1 Hour added: "+oneHrsIncrementDate);

        //Subtracting 5 hrs and 30 min
        LocalDateTime subSpecificTimeDate = currentDate.minusHours(5).minusMinutes(30);
        System.out.println("Decremented 5 hrs & 30 min: "+subSpecificTimeDate);

        //adding to a list then sorting it
        List<LocalDateTime> dateData = new ArrayList<>();
        dateData.add(currentDate);
        dateData.add(incrementedDate);
        dateData.add(decrementDate);
        dateData.add(oneHrsIncrementDate);
        dateData.add(subSpecificTimeDate);

        Collections.sort(dateData);

        System.out.println("printing the dates in sorted order: ");

        for(LocalDateTime date: dateData){
            System.out.println(date);
        }
    
        scan.close();
    } 
    
}
