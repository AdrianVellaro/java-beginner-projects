import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You're a minor.");
        }
        else if (age == 18) {
            System.out.println("You are of age.");
        }
        else if (age > 60) {
            System.out.println("You are old.");
        }
        else {
            System.out.println("You are an adult.");
        }
    }
}
