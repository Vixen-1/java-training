package effigo.ayushi.training.variables;


public class AppleStore {
    public static void main(String[] args) {
        int apples = 0;
        int customers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");
        apples += 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");

        System.out.println("One customer walked in. He bought 4 apples!");
        customers += 1;
        profit += 4*40;
        apples -= 4;

        System.out.println("Another customer walked in. He bought 20 apples!");
        customers += 1;
        profit += 40*20;
        apples -= 20;

        System.out.println("Another customer walked in. She bought 200 apples!");
        customers += 1;
        profit += 200*40;
        apples -= 200;

        System.out.println("Wow! So far, you made: "+ profit);
        System.out.println(customers + "customers love your apples.");
        System.out.println("You have "+ apples +" apples left.");

        // Compare your result to what's on Learn the Part.  
        
    }

}
