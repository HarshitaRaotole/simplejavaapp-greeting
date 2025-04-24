
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print a greeting message
        System.out.println("Hello, " + name + "!");
    }
}
