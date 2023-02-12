import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        boolean valid = false;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();

                // Convert the temperature from Celsius to Fahrenheit
                fahrenheit = (9.0 / 5.0) * celsius + 32;

                System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
                valid = true;
            } else {
                System.out.println("Invalid input, please enter a valid temperature in Celsius.");
                input.nextLine();
            }
        } while (!valid);
    }
}

