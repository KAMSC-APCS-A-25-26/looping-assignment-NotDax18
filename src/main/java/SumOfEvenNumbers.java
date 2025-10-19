import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");

        try {
            int n = scanner.nextInt();

            if (n < 2) {
                System.out.println("Error: Input must be 2 or greater.");
                scanner.close();
                return;
            }

            int sum = 0;
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }

            System.out.println("The sum of even numbers between 2 and " + n + " is " + sum + ".");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer value.");

        }
    }
}