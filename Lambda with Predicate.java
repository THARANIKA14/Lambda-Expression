import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50);

        // Predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
