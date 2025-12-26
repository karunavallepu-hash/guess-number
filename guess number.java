import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(10) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 10");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! 🎉");
            }
        }
    }
}
