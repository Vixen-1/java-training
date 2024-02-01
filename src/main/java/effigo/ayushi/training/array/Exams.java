package effigo.ayushi.training.array;

public class Exams {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.2).
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        String[] seats = {"Ayushi", "Dhruv", "Harshit", "Vidushi", "Abhiyansh"};

        for(int i=0; i< seats.length-1; i++){
            System.out.println(seats[i] + ", you will take seat " + i);
        }
    }
}
