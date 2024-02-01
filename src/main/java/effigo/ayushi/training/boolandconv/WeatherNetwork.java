package effigo.ayushi.training.boolandconv;


public class WeatherNetwork {
    public static void main(String[] args) {        
        int temp = 25;  

        String forecast;
        if (temp >= 25){
            forecast = "its warm! go outside!";
        }
        else if(temp >= 10){
            forecast = "its chilly! wear a coat.";
        }
        else{
            forecast = "its freezing! dont go outside!";
        }
        
        System.out.println(forecast);
    }
}
