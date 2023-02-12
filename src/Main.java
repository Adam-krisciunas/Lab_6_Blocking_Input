import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter a temperature in Celsius: ");
                celsius = input.nextDouble();

                // Convert the temperature from Celsius to Fahrenheit
                fahrenheit = (9.0 / 5.0) * celsius + 32;

                System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid temperature in Celsius.");
                input.nextLine();
            }
        }
    }
}
