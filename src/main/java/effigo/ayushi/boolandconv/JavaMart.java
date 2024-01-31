package effigo.ayushi.boolandconv;


public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 
        if(toyCar <= wallet){
            System.out.println("sure!");
            wallet -= toyCar;
        }
        //else:  Sorry, I only have <wallet> left.
        else{
            System.out.println("Sorry, I only have " + wallet + " Left");
        }
        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(nike <= wallet){
            System.out.println("sure!");
            wallet -= nike;
        }
        //else:  Sorry, I only have <wallet> left.
        else{
            System.out.println("Sorry, I only have " + wallet + " Left");
        }

    }
}
