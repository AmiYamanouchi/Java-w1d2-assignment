
import java.util.Scanner;

public class ComputeAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("please enter 3 numbers: ");

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        double avg = ((num1 + num2 + num3) / 3);

        System.out.println("your average is :" + avg);
        
    }
    
}
