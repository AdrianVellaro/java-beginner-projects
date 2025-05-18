import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Uh oh! Something went wrong.");
            }
        }
        System.out.println("KABOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!");
    input.close();
    }
}
