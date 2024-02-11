import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAdditionalMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi");

        // filter()
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        // map()
        System.out.println("Uppercase names:");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();

        // reduce()
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        System.out.println();

        // collect()
        List<String> capitalizedFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Capitalized fruits: " + capitalizedFruits);
        System.out.println();

        // sorted()
        System.out.println("Sorted names:");
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
