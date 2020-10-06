import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Celsius:  ");

        double c = input.nextDouble();
        
        double f = (9 / 5) * c + 32;

        System.out.println( f + " Fahrenheit");

        
    }
    
}