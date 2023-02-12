import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width;
        double height;
        double area;
        double perimeter;
        double diagonal;

        do {
            System.out.print("Enter the width of the rectangle: ");
            width = scan.nextDouble();
            System.out.print("Enter the height of the rectangle: ");
            height = scan.nextDouble();
            if (width <= 0 || height <= 0) {
                System.out.println("Invalid input. Width and height must be positive numbers.");
            }
        } while (width <= 0 || height <= 0);

        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
