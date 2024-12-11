import java.util.Scanner;

public class IT24103806Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner moon = new Scanner(System.in);

        // Prompt the user for three integers and read them
        System.out.println("Enter first integer:");
        int NO1 = moon.nextInt();

        System.out.println("Enter second integer:");
        int NO2 = moon.nextInt();

        System.out.println("Enter third integer:");
        int NO3 = moon.nextInt();

        // Find the smallest and largest numbers
        int smallest = Math.min(NO1, Math.min(NO2, NO3));
        int largest = Math.max(NO1, Math.max(NO2, NO3));

        // Print the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the Scanner
        moon.close();
    }
}
