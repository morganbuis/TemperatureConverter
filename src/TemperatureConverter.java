import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Attempt 1 at building my gitHub repo, don't judge too hard.
 *
 * I decided to build a temperature converter
 */

public class TemperatureConverter {

    // Unicode for degrees
    final static char degreeSymbol = '\u00B0' ;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Are you wanting to convert to Celsius or Fahrenheit? Enter C or F: ");
        String convertTo = input.next();

        if (convertTo.equalsIgnoreCase("F")){
            convertToFahrenheit();
        } else if (convertTo.equalsIgnoreCase("C")) {
            convertToCelsius();
        } else {
            System.out.println("game over, input invalid");
        }
    }

    static void convertToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value you would like converted to Fahrenheit: ");
        try  {
            double celsiusValue = Double.parseDouble(input.next());
            double fahrenheitValue = (celsiusValue*9/5)+32;
            System.out.println(celsiusValue + " " + degreeSymbol + "C, is equivalent to " + fahrenheitValue + " " + degreeSymbol + "F");
        } catch(Exception ex) {
            System.out.println("You entered something that wasn't right and got this exception, sorry: " + ex);
        }

    }

    static void convertToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value you would like converted to Celsius: ");
        try  {
            double fahrenheitValue = Double.parseDouble(input.next());
            double celsiusValue = (fahrenheitValue-32)*5/9;
            System.out.println(fahrenheitValue + " " + degreeSymbol + "F, is equivalent to " + celsiusValue + " " + degreeSymbol + "C");
        } catch(Exception ex) {
            System.out.println("You entered something that wasn't right and got this exception, sorry: " + ex);
        }

    }



}
