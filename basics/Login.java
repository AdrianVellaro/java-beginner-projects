import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String name = "Ardi";
        int password = 1234;

        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN KE AKUN MU");
        System.out.println("Enter your username: ");
        String usernameGuess = input.nextLine();
        System.out.println("Enter your password: ");
        int passwordGuess = input.nextInt();

        if (usernameGuess.equals("Ardi") && passwordGuess == 1234) {
            System.out.println("Sudah Login!");
        }
        else {
            System.out.println("Username salah! Goblok!");
        }
    }
}
