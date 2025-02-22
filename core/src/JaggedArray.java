public class JaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][]; // Declare a jagged array with 3 rows
        jaggedArr[0] = new int[]{1, 2};  // First row has 2 elements
        jaggedArr[1] = new int[]{3, 4, 5}; // Second row has 3 elements
        jaggedArr[2] = new int[]{6, 7, 8, 9}; // Third row has 4 elements

        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
