public class JumpStatementsExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating break statement:");
        breakExample();

        System.out.println("\nDemonstrating continue statement:");
        continueExample();

        System.out.println("\nDemonstrating return statement:");
        String val = returnExample();
        System.out.println("Demonstrating :    "+val);
        

    }

    // Example of 'break' statement
    static void breakExample() {
        for (int i = 200; i <= 1000; i++) {
            if (i == 500) {
                System.out.println("Break at i = " + i);
                break; // Exits the loop when i == 3
            }
            System.out.println("i = " + i);
        }
    }

    // Example of 'continue' statement
    static void continueExample() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Continue at i = " + i);
                //continue; // Skips the rest of the loop for i == 3
            }
            System.out.println("i = " + i);
            continue;
           // System.out.println("i = " + i);
        }
    }

    // Example of 'return' statement
    static String  returnExample() {
        System.out.println("Before return statement.");
        return "Raju";
    }
}
