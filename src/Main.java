import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the person's age.
        Scanner scanner = new Scanner(System.in);

        // Stores the age.
        int age = scanner.nextInt();

        // Checks if the person is of legal drinking age.
        if (age >= 21) {
            System.out.println("You are eligible to consume alcohol");
        } else {
            System.out.println("You are not eligible to consume alcohol. Go home kid!");
        }
    }
}