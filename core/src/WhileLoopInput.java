import java.util.Scanner;

public class WhileLoopInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number (enter 0 to stop): ");
        number = scanner.nextInt();

        while (number != 0) {
            System.out.println("You entered: " + number);
            System.out.println("Enter another number (enter 0 to stop): ");
            number = scanner.nextInt();
        }

        System.out.println("Loop exited. Program terminated.");
        scanner.close();
    }
}
