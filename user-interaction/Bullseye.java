import java.util.Random;
import java.util.Scanner;

public class Bullseye {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int tries = 0;
        boolean exit = false;
        int number = random.nextInt(100) + 1;

        System.out.println("---WELCOME TO THE BULLSEYE GAME!---");
        System.out.println("We will tally how many tries it took for you to guess the correct number!");
        System.out.println("Enter your guess, lad!");

        do {
            int userGuess = input.nextInt();
            tries++;
            if (userGuess > number) {
                System.out.println("Too high, lad!");
                System.out.println("Total tries: " + tries);
            }
            else if (userGuess < number) {
                System.out.println("Too low, lad!");
                System.out.println("Total tries: " + tries);
            }
            else if (userGuess == number) {
                System.out.println("Well done, lad! You guessed it in " + tries + " tries.");
                exit = true;
            }
            
            if (!exit) {
                System.out.println("Have another go, lad!");
            }
        } while (!exit);
    }
}
