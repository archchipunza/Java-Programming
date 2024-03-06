import java.util.Random;

public class EvenOrNot {
    public static void main(String[] args) {
        // Initialize a new Random object
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Print the generated random number to the console with an explanation
        System.out.println("Generated random number: " + randomNumber + " (between 1 and 100)");

        // Check if the random number is even or odd
        if (randomNumber % 2 == 0) {
            // If the remainder of the division by 2 is 0, the number is even
            System.out.println("The random number is even.");
        } else {
            // Otherwise, the number is odd
            System.out.println("The random number is odd.");
        }
    }
}