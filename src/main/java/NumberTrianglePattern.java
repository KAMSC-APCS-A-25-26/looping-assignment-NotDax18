import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt must match the tests exactly
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();

        // If input is negative, stop (tests expect no further output)
        if (num < 0) {
            sc.close();
            return;
        }

        // Generate the number triangle pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}