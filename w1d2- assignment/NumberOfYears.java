import java.util.Scanner;


public class NumberOfYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int yearOfMins = 525600;
        final int dayOfMinutes = 1440;

        System.out.print("Enter minutes: ");

        int minutes = input.nextInt();

        int year = minutes / yearOfMins;

        int remainder = minutes % yearOfMins;

        int day = remainder / dayOfMinutes;

        System.out.println(year + " years " + day + " days");

        
    }
    
}
