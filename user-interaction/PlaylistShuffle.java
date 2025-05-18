import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlaylistShuffle {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        System.out.println("----WELCOME TO PLAYLISTO----");
        System.out.println("1. Add Song");
        System.out.println("2. Shuffle Playlist");
        System.out.println("3. Show Playlist");
        System.out.println("4. Exit");

        do {
            int choice = input.nextInt();
        input.nextLine(); 

        if (choice == 1) {
            System.out.println("Enter the name of your song!");
            String song = input.nextLine();
            playlist.add(song);
            System.out.println("Song added: " + song);
        }
        else if (choice == 2) {
            if (playlist.isEmpty()) {
                System.out.println("Playlist is empty!");
            }
            else {
                System.out.println("Shuffling playlist...");
                Collections.shuffle(playlist);
                System.out.println("Playlist shuffled!");
            }
        }
        else if (choice == 3) {
            if (playlist.isEmpty()) {
                System.out.println("Playlist is empty!");
            } 
            else {
                System.out.println("Your playlist:");
                for (int i = 0; i < playlist.size(); i++) {
                    System.out.println(playlist.get(i));
                }
            }
        }
        else if (choice == 4) {
            System.out.println("Goodbye!");
            exit = true;
            input.close();
        }
        System.out.println("\n");
        System.out.println("----WELCOME TO PLAYLISTO----");
        System.out.println("1. Add Song");
        System.out.println("2. Shuffle Playlist");
        System.out.println("3. Show Playlist");
        System.out.println("4. Exit");
        } while (!exit);
    }
 }

