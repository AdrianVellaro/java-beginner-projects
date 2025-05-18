import java.util.Scanner;

public class TempConverter {
    static double celsius;
    static double fahrenheit;

    public static double celsiusToFahrenheit(double celsius) {
        double calculation = 0;
        calculation = (celsius * 9/5) + 32;
        return calculation;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double calculation = 0;
        calculation = (fahrenheit - 32) * 5/9;
        return calculation;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------TEMPERATURE CONVERTER-------");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch(choice) {
           case 1: {
            System.out.print("Enter temperature in Celsius: ");
            celsius = input.nextDouble();
            fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Fahrenheit : " + fahrenheit);
           }
           case 2: {
            System.out.print("Enter temperature in Fahrenheit: ");
            fahrenheit = input.nextDouble();
            celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Celsius : " + celsius);
           }
           case 3: {
            System.out.println("Exiting the program");
            System.exit(0);
           }
        }
    }
}
