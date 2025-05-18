import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your operator: (+, -, *, /)");
        String operator = input.nextLine();

        if (operator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (operator.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (operator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (operator.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else {
            System.out.println("Invalid operator.");
        }
    }
}
