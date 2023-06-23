package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display available genres
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        // Get user input for name and genre
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your favorite genre number: ");
        int genreNumber = scanner.nextInt();
        
        // Validate and create user profile
        if (genreNumber >= 1 && genreNumber <= genres.length) {
            String selectedGenre = genres[genreNumber - 1];
            UserProfile userProfile = new UserProfile(name, selectedGenre);
            System.out.println("User profile created successfully.");
            System.out.println("Name: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid genre number selected.");
        }
   }
}