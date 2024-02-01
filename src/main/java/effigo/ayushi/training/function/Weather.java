package effigo.ayushi.training.function;


public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }
    public static double fahrenheitToCelsius(double F){
        double C = (F - 32) * 5 / 9;
        return C;
    }
    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
    public static void printTemperatures(double F){
        System.out.println("Temperature in Fahrenheit " + F);
        System.out.println("Temperature in Celcius " + fahrenheitToCelsius(F));
    }
}