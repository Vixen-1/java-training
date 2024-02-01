package effigo.ayushi.training.array;

import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.

        System.out.println("how many historical figures will you register?");
        int num = scan.nextInt();

        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        
        String[][] databases = new String[num][3];

        scan.nextLine();
        //Watch out for the nextLine() pitfall. 

        for (int i=0; i< num; i++) {
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            // pick up and store figure's name. 
            String name = scan.nextLine();
            databases[i][0] = name;

            System.out.print("\t - Date of birth: ");
            // pick up and store figure's birthday.
            String dob = scan.nextLine();
            databases[i][1] = dob;

            System.out.print("\t - Occupation: ");
            // pick up and store figure's occupation. 
            String occupation = scan.nextLine();
            databases[i][2] = occupation;

            System.out.print("\n");

        }
        System.out.println("These are the values you stored:"); 
        print2DArray(databases);
    
        System.out.print("\nWho do you want information on? "); 
        String name = scan.nextLine();
        
        for (int i = 0; i < databases.length; i++) {
            if (databases[i][0].equals(name)) {
                System.out.println("\tName: " + databases[i][0]);
                System.out.println("\tDate of birth: " + databases[i][1]);
                System.out.println("\tOccupation: " + databases[i][2]);
            }
        }
        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array){
        for(int i=0; i< array.length; i++){
            System.out.print("\t");
            for (int j=0; j<3; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
