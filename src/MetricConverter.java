import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a measurement in meters: ");

        if (!input.hasNextDouble()) {
            System.err.println("Error: Invalid input. Please enter a valid number in meters.");
            input.next();
        }

        double meters = input.nextDouble();

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = feet * 12;

        System.out.println(meters + " meters is equal to " + miles + " miles.");
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        System.out.println(meters + " meters is equal to " + inches + " inches.");
    }
}
