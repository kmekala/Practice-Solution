import java.util.Iterator;

public class ExampleIterator2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Iterator<Integer> iterator = new TwoDArrayIterator(arr);

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
    }
}

class TwoDArrayIterator implements Iterator<Integer> {
    private int[][] array;
    private int row, col;

    public TwoDArrayIterator(int[][] arr) {
        array = arr;
        row = 0;
        col = 0;
    }

    @Override
    public boolean hasNext() {
        return row < array.length && col < array[row].length;
    }

    @Override
    public Integer next() {
        int element = array[row][col];
        col++;

        if (col >= array[row].length) {
            row++;
            col = 0;
        }

        return element;
    }
}
