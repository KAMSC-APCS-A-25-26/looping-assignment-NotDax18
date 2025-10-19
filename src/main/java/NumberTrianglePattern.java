import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) System.out.print(" ");
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }

}