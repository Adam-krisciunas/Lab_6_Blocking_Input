import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        int guess;

        do {
            System.out.println("Guess the number between 1 and 10: ");
            guess = sc.nextInt();
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            }
        } while (guess != randomNumber);

        System.out.println("You got it! The number was " + randomNumber);
    }
}
