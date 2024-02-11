import java.util.Arrays;

public class Example2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // length: Returns the length (number of rows) of the 2D array
        int rows = arr.length;
        System.out.println("Number of rows in the 2D array: " + rows);

        // length: Returns the length (number of columns) of the specified row in the 2D array
        int columns = arr[0].length;
        System.out.println("Number of columns in the 2D array: " + columns);

        // deepToString(Object[] a): Returns a string representation of the 2D array
        String stringRepresentation = Arrays.deepToString(arr);
        System.out.println("String representation of the 2D array: " + stringRepresentation);

        // fill(int[][] a, int val): Fills the 2D array with the specified value
        int val = 0;
        for (int[] row : arr) {
            Arrays.fill(row, val);
        }
        System.out.println("2D array after filling with " + val + ": " + Arrays.deepToString(arr));

        // copyOf(int[][] original, int newLength): Copies the specified 2D array, truncating or padding with zeros if necessary
        int newLength = 2;
        int[][] copiedArr = Arrays.copyOf(arr, newLength);
        System.out.println("Copied 2D array with new length " + newLength + ": " + Arrays.deepToString(copiedArr));
    }
}
