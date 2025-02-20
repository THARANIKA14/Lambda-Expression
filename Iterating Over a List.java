import java.util.Arrays;
import java.util.List;

public class LambdaIterationExampl
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Print each name using a lambda
        names.forEach(name -> System.out.println(name));
    }
}
