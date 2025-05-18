import java.util.Scanner;

public class AgeSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int userAge = input.nextInt();
        int seconds = userAge * 60 * 60 * 24 * 365;
        System.out.println("You have lived for an estimated " + seconds + " seconds");
    }
}
