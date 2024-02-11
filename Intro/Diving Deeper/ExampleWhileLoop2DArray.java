public class ExampleWhileLoop2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row = 0;
        int col;

        while (row < arr.length) {
            col = 0;
            while (col < arr[row].length) {
                System.out.print(arr[row][col] + " ");
                col++;
            }
            row++;
        }
    }
}
