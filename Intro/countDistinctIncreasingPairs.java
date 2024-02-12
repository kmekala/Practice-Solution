import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6, 7};

        int count = countDistinctIncreasingPairs(numbers);
        System.out.println("Count of distinct increasing pairs: " + count);
    }

    public static int countDistinctIncreasingPairs(int[] numbers) {
        int count = 0;
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int j = 1; j < numbers.length; j++) {
            for (int i = 0; i < j; i++) {
                if (numbers[i] < numbers[j] && !distinctNumbers.contains(numbers[i])) {
                    count++;
                    distinctNumbers.add(numbers[i]);
                }
            }
        }

        return count;
    }
}
