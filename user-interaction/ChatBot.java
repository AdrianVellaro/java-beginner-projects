import java.util.Scanner;
import java.util.Random;

public class ChatBot {
    public static void main(String[] args) {
        Random random = new Random();
        boolean exit = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the chatbot!");

        String[] jokes = {
            "Why don't skeletons fight each other? They don't have the guts.",
            "I'm reading a book about anti-gravity. It's impossible to put down!",
            "Why did the scarecrow win an award? Because he was outstanding in his field.",
            "I told my computer I needed a break, and it said 'No problem – I’ll go to sleep.'",
            "Parallel lines have so much in common... it’s a shame they’ll never meet.",
            "What do you call fake spaghetti? An impasta.",
            "I would tell you a joke about time travel, but you didn’t like it.",
            "Why did the Java developer wear glasses? Because they couldn't C#!",
            "I asked the dog, ‘What’s two minus two?' He said nothing.",
            "Why can’t you trust atoms? Because they make up everything!"
        };


        do {
            System.out.println("Chatbot9000: Ask me a question!");
            String userResponse = input.nextLine();

            if (userResponse.equalsIgnoreCase("Hi")) {
                System.out.println("Chatbot9000: Hi! How are you today?");
            }
            else if (userResponse.equalsIgnoreCase("How are you")) {
                System.out.println("Chatbot9000: I'm doing well, thanks for asking!");
            }
            else if (userResponse.equalsIgnoreCase("What's your name")) {
                System.out.println("My name is Chatbot9000!");
            }
            else if (userResponse.equalsIgnoreCase("Tell me a joke")) {
                System.out.println(jokes[random.nextInt(9)]);
            }
            else if (userResponse.equalsIgnoreCase("Exit") || userResponse.equalsIgnoreCase("Quit")) {
                System.out.println("Chatbot9000: Goodbye!");
                exit = true;
            }
        } while (!exit);
    }
}
