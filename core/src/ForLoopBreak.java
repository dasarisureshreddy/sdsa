public class ForLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop breaks at " + i);
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}
