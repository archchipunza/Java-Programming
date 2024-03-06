import java.util.Random;

public class ContainersForBlocks {
    public static void main(String[] args) {
        // Initialize a new Random object
        Random random = new Random();

        // Choose an odd number between 50 and 100 for the amount of Lego bricks
        int amountOfBricks = random.nextInt(50) + 51;
        System.out.println("Amount of bricks: " + amountOfBricks);

        // Choose an even number between 5 and 10 for the capacity of one Lego container
        int containerCapacity = (random.nextInt(6) + 5) * 2;
        System.out.println("Container capacity: " + containerCapacity);

        // Calculate the number of full containers
        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of full containers: " + fullContainers);

        // Calculate the number of total containers
        int totalContainers = (amountOfBricks % containerCapacity == 0) ? fullContainers : fullContainers + 1;
        System.out.println("Number of total containers: " + totalContainers);

        // Calculate the number of blocks in the not completely full container
        int blocksInLastContainer = (amountOfBricks % containerCapacity);
        System.out.println("Number of blocks in the not completely full container: " + blocksInLastContainer);
    }
}