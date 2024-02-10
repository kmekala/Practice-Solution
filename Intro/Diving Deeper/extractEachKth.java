//  extractEachKth method successfully extracted every 3rd element from the input array and returned an array 
// containing the remaining elements. In this case, the extracted array is [1, 2, 4, 5, 7, 8, 10]. 
// The method uses a flag (flag) to determine if any elements were extracted. If no elements were extracted, 
// it returns the original input array. Otherwise, it creates a new array (arr1) to store the remaining elements and returns it.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int[] result = extractEachKth(inputArray, k);
        System.out.println("Extracted array: " + Arrays.toString(result));
    }
    
    public static int[] extractEachKth(int[] inputArray, int k) {
    int[] arr = new int[inputArray.length];
    int q = 0;
    int p = 0;
    int count = 1;
    int flag = 1;
    
    // Iterate over the inputArray
    for (int i = 0; i < inputArray.length; i++) {
        if (count == k) {
            // If count equals k, it means it's the kth element
            count = 1;
            arr[i] = 10101; // Use a special value (10101) to mark the extracted element
            flag = 0; // Set flag to indicate that at least one element was extracted
        } else {
            // If count is not equal to k, copy the element from inputArray to arr
            arr[i] = inputArray[i];
            count++;
            q++;
        }
    }
    
    if (flag == 1) {
        // If no elements were extracted (flag is still 1), return the inputArray
        return inputArray;
    } else {
        // If at least one element was extracted
        int[] arr1 = new int[q];
        // Iterate over arr to create a new array (arr1) without the extracted elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10101) {
                // Skip the extracted element
            } else {
                // Copy the non-extracted element to arr1
                arr1[p] = arr[i];
                p++;
            }
        }
        return arr1; // Return the new array without the extracted elements
    }
}
}
