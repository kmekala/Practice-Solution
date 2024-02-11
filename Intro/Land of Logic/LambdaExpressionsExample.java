import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));
        System.out.println();

        // Consumer
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
        printUpperCase.accept("world");
        System.out.println();

        // Function
        Function<Integer, String> convertToString = number -> Integer.toString(number);
        System.out.println("Number 42 as string: " + convertToString.apply(42));
        System.out.println("Number 99 as string: " + convertToString.apply(99));
        System.out.println();

        // Supplier
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());
        System.out.println("Random number: " + randomNumber.get());
        System.out.println();

        // UnaryOperator
        UnaryOperator<Integer> square = number -> number * number;
        System.out.println("Square of 5: " + square.apply(5));
        System.out.println("Square of 8: " + square.apply(8));
        System.out.println();

        // BinaryOperator
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 3 and 4: " + sum.apply(3, 4));
        System.out.println("Sum of 9 and 2: " + sum.apply(9, 2));
        System.out.println();
    }
}
