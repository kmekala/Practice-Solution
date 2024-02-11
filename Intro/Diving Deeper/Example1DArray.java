import java.util.Arrays;

public class Example1DArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9};

        // length: Returns the length of the array
        int length = arr.length;
        System.out.println("Length of the array: " + length);

        // sort(): Sorts the elements of the array in ascending order
        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

        // binarySearch(int[] a, int key): Searches the array for the specified element using binary search
        int key = 7;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Index of element " + key + ": " + index);

        // fill(int[] a, int val): Fills the array with the specified value
        int val = 0;
        Arrays.fill(arr, val);
        System.out.println("Array after filling with " + val + ": " + Arrays.toString(arr));

        // copyOf(int[] original, int newLength): Copies the specified array, truncating or padding with zeros if necessary
        int newLength = 3;
        int[] copiedArr = Arrays.copyOf(arr, newLength);
        System.out.println("Copied array with new length " + newLength + ": " + Arrays.toString(copiedArr));
    }
}
