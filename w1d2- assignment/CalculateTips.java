import java.util.Scanner;

public class CalculateTips {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter cost: ");

        double cost = input.nextDouble();

        double includeTips = cost * 1.15;

        System.out.println("Cost including Tip is: " + includeTips);
        

    }
    
}
