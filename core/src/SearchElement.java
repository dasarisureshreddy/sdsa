public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int key = 20;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element " + key + " found in the array.");
        else
            System.out.println("Element " + key + " not found in the array.");
    }
}
