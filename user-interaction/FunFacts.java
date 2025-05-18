import java.util.Scanner;
import java.util.Random;

public class FunFacts {
    public static void main(String[] args) {
        Random random = new Random();
        int funFact;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fun Facts!");
        System.out.println("Enter a topic: (space, animals, history)");
        String topic = input.nextLine();

        String[] spaceFacts = {
            "A day on Venus is longer than a year on Venus.",
            "Neutron stars can spin up to 600 times per second.",
            "The Moon is slowly drifting away from Earth - about 3.8 cm per year.",
            "There's a planet made of diamonds called 55 Cancri e.",
            "Saturn's density is so low it would float in water."
        };

        String[] historyFacts = {
            "Napoleon was once attacked by a horde of bunnies during a hunt.",
            "In Ancient Egypt, servants were smeared with honey to attract flies away from pharaohs.",
            "Oxford University is older than the Aztec Empire.",
            "Julius Caesar was once kidnapped by pirates — and demanded they raise his ransom.",
            "The Eiffel Tower grows in summer due to metal expansion."
        };

        String[] animalFacts = {
            "Octopuses have three hearts and blue blood.",
            "A group of flamingos is called a 'flamboyance'.",
            "Cows have best friends and get stressed when separated.",
            "Elephants mourn their dead.",
            "Sloths can hold their breath longer than dolphins.",
            "Turritopsis dohrnii is a jellyfish that can live forever (technically).",
            "Penguins propose to mates with pebbles.",
            "A shrimp's heart is in its head!",
            "Frogs can freeze and still come back to life.",
            "Koalas have fingerprints almost identical to humans'."
        };

        if (topic.equalsIgnoreCase("space")) {
            funFact = random.nextInt(spaceFacts.length);
            System.out.println("Fun Fact: " + spaceFacts[funFact]);
        }
        else if (topic.equalsIgnoreCase("history")) {
            funFact = random.nextInt(historyFacts.length);
            System.out.println("Fun Fact: " + historyFacts[funFact]);
        }
        else if (topic.equalsIgnoreCase("animals")) {
            funFact = random.nextInt(animalFacts.length);
            System.out.println("Fun Fact: " + animalFacts[funFact]);
        }
    }
}
