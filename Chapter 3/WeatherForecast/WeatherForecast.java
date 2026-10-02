
/**
 * Write a description of class WeatherForecast here. 
 *
 * Ansh Tewatia
 * 10/2/2026
 */
public class WeatherForecast
{
   //define an enum for fixed weather categories
    public enum WeatherType {
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy,
    } 
    public static void main(String[] args) {
        //Create a counter variable to count the number of rainy days
        int rainyDays=0;
        
        //Array of all possible enum constants
        WeatherType[] options = WeatherType.values();
        
        
        //Header parts:
        //Initializer (int day=1)
        //Condition (day<= 7)
        //Mutator (day++)
        for (int day=1; day<= 7; day++) {
            //Pick a radom index from 0 to the length of our enum
            int rndIndex = (int)(Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            //Day 1: Weather
            System.out.println("Day "+day+":"+today);
            
            //Enums are compared using== because they are ints 
            if (today == WeatherType.Rainy) {
                rainyDays++;
                
        }
        
   }
    System.out.println("They are "+rainyDays+" days of rain in the forecast.");
    System.out.println("All supported weather types:");
    
    //An enhanced for loop (for-each loop)
    //iterates directly through every element in WeatherType.value
    for (WeatherType w: WeatherType.values()) {
            
    }
    
    
}
}