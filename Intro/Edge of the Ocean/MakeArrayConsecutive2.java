//[6, 2, 3, 8], and the minimum value is 2 and the maximum value is 8. 
// The difference between the maximum and minimum values is 6, and we subtract the length of the array (4) from it, 
// resulting in 2. Since we need to have consecutive values, we add 1 to the difference, making it 7. 
// Therefore, we need 7 - 4 = 3 additional statues.
//The code initializes min and max variables with extreme values. It iterates through the statues array, updating min and max 
// if necessary. After the loop, the difference between max and min is calculated, and the result is obtained by adding 1 to the 
// difference and subtracting the length of the array. This gives the number of additional statues needed to make the array consecutive.

public class Main {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        int result = makeArrayConsecutive2(statues);
        System.out.println("Additional statues needed: " + result);
    }
    
    public static int makeArrayConsecutive2(int[] statues) {
        int min = 99999;  // Initialize min with a large value
        int max = -999;   // Initialize max with a small value
        
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] > max) {
                max = statues[i];  // Update max if the current element is greater
            }
            
            if (statues[i] < min) {
                min = statues[i];  // Update min if the current element is smaller
            }
        }
        
        int diff = max - min;  // Calculate the difference between max and min
        return (diff + 1 - statues.length);  // Return the number of additional statues needed
    }
}
