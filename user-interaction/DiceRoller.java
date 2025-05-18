import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("-----Welcome to the Dice Roller-----");
        System.out.println("Select Which One To Roll:");
        System.out.println("1. One Die");
        System.out.println("2. Two Dice");
        int choice = input.nextInt();

        int roll = 0;
        int min = 1;

        if (choice == 1) {
            System.out.println("Die is currently being rolled...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Uh oh! Something went wrong.");
            }
            roll = min + random.nextInt(6);
        }
        else if (choice == 2) {
            System.out.println("Dice are currently being rolled...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Uh oh! Something went wrong.");
            }
            int die1 = min + random.nextInt(6);
            int die2 = min + random.nextInt(6);
            roll = die1 + die2;
        }
        else {
            System.out.println("Invalid choice");
        }

        System.out.println("Roll of the Die/Dice: " + roll);
        input.close();
    }
}
