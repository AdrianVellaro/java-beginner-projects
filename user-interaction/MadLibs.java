import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an adjective: ");
        String adjective = input.nextLine();
        System.out.println("Please enter a noun: ");
        String noun = input.nextLine();
        System.out.println("Please enter a verb: ");
        String verb = input.nextLine();
        System.out.println("Please enter a place: ");
        String place = input.nextLine();

        int luck = random.nextInt(4);

        if (luck == 0) {
            System.out.println("The " + adjective + " " + noun + " decided to " + verb + " all the way to the " + place + ".");
        }
        else if (luck == 1) {
            System.out.println("At the " + place + ", a " + adjective + " " + noun + " tried to " + verb + " past security.");
        }
        else if (luck == 2) {
            System.out.println("I saw a " + adjective + " " + noun + " " + verb + " near the " + place + " yesterday.");
        }
        else if (luck == 3) {
            System.out.println("A " + adjective + " " + noun + " can usually " + verb + " better at the " + place + ".");
        }
        else if (luck == 4) {
            System.out.println("When I go to the " + place + ", I always bring my " + adjective + " " + noun + " to " + verb + ".");
        }
    }
}
