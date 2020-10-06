import java.util.Scanner;

public class NextString {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name please: ");

        String name = input.nextLine();

        System.out.println("enter an age: ");
        
        int age = input.nextInt();

        System.out.println("Hello " + name + " you are " + age + " years old");
    }
    
}
