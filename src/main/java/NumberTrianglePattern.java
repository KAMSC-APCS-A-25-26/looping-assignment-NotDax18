import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        // Step 1: User Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Step 2: Pattern Generation
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for numbers in each row
                System.out.print(j); // Print number
                if (j < i) { // Avoid trailing space
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }

        input.close();
    }
}