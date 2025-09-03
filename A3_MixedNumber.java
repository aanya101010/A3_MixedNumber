import java.util.Scanner;

public class A3_MixedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prompts
        System.out.println("Enter the numerator of the fraction:");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator of the fraction:");
        int denominator = scanner.nextInt();

        // Compute mixed number
        int whole = numerator / denominator;
        int remainder = numerator % denominator;

        System.out.println(); // blank line

        // Output sentence (always shows remainder, even if 0)
        System.out.println("The mixed number derived from the fraction "
                + numerator + "/" + denominator
                + " is " + whole + " " + remainder + "/" + denominator + ".");

        scanner.close();
    }
}
