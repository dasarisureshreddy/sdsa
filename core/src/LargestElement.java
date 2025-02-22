public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 25, 8};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}
