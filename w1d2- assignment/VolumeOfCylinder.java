import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double pi = 3.14159;

        System.out.print("Enter radius:  ");

        double radius = input.nextDouble();

        System.out.print("Enter length:  ");

        double length = input.nextDouble();

        double volume = radius * radius * pi * length;

        System.out.println("Volume is : " + volume);

        
    }
    
}
