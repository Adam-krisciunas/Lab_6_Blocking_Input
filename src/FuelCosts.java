import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gallons, efficiency, pricePerGallon;

        do {
            System.out.print("Enter the amount of gallons of gas in the tank: ");
            gallons = sc.nextDouble();
            if (gallons <= 0) {
                System.out.println("Invalid input. Number of gallons should be a positive number.");
            }
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            efficiency = sc.nextDouble();
            if (efficiency <= 0) {
                System.out.println("Invalid input. Fuel efficiency should be a positive number.");
            }
        } while (efficiency <= 0);

        do {
            System.out.print("Enter the price of gas: ");
            pricePerGallon = sc.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Invalid input. Price per gallon should be a positive number.");
            }
        } while (pricePerGallon <= 0);

        double costPer100Miles = 100.0 / efficiency * pricePerGallon;
        double distance = gallons * efficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance that can be traveled with the gas in the tank: " + distance);
    }
}
