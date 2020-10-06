import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args)  {
        
        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("please Enter a Radius: "); //printにすると同じ列になるlnは改行する

        double radius = input.nextDouble();

        System.out.println("the area of circle is :" + (radius * radius * pi));
    }

    
}
