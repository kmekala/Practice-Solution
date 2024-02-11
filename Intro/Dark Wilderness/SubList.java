import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Extract a sublist from index 1 to 4 (exclusive)
        List<Integer> sublist = numbers.subList(1, 4);

        System.out.println("Original List: " + numbers);
        System.out.println("Sublist: " + sublist);

        // Modifying the sublist will affect the original list
        sublist.set(0, 10);

        System.out.println("Modified Sublist: " + sublist);
        System.out.println("Updated Original List: " + numbers);

        // Modifying the original list will affect the sublist
        numbers.add(2, 20);

        System.out.println("Updated Original List: " + numbers);
        System.out.println("Modified Sublist: " + sublist);
    }
}
