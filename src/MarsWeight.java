import java.util.Scanner;

public class MarsWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your weight in kg: ");
        float earthWeight = scanner.nextFloat();
        scanner.close();

        double marsWeight = calculateMarsWeight(earthWeight);
        int marsWeightInt = (int) Math.round(marsWeight);
        String marsWeightStr = Integer.toString(marsWeightInt);
        char marsWeightChar = marsWeightStr.charAt(0);

        System.out.println("Your weight on Mars would be: " + marsWeight + " kg");
        System.out.println("Your weight on Mars as an integer: " + marsWeightInt);
        System.out.println("Your weight on Mars as a character: " + marsWeightChar);
        System.out.println("Your weight on Mars as an integer after casting from a character: " + (int) marsWeightChar);
    }

    private static double calculateMarsWeight(float earthWeight) {
        return earthWeight * 0.38;
    }
}