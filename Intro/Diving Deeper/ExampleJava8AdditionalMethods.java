import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleJava8AdditionalMethods {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");

        // forEach()
        System.out.println("Names:");
        names.forEach(System.out::println);
        System.out.println();

        // removeIf()
        names.removeIf(name -> name.startsWith("J"));
        System.out.println("Names after removeIf():");
        names.forEach(System.out::println);
        System.out.println();

        // replaceAll()
        names.replaceAll(String::toUpperCase);
        System.out.println("Names after replaceAll():");
        names.forEach(System.out::println);
        System.out.println();

        // merge()
        Map<String, Integer> ageMap = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));

        ageMap.merge("John", 30, Integer::sum);
        ageMap.merge("Alice", 25, Integer::sum);
        System.out.println("Age map:");
        ageMap.forEach((name, age) -> System.out.println(name + ": " + age));
        System.out.println();

        // computeIfAbsent()
        Map<String, String> nicknameMap = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.substring(0, 3)));

        nicknameMap.computeIfAbsent("Alice", name -> "Unknown");
        nicknameMap.computeIfAbsent("Bob", name -> "Unknown");
        System.out.println("Nickname map:");
        nicknameMap.forEach((name, nickname) -> System.out.println(name + ": " + nickname));
        System.out.println();
    }
}
