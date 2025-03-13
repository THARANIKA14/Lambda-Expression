import java.util.Arrays;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gokul", "John", "Emily");

        // Using Lambda to iterate through the list
        names.forEach(name -> System.out.println("Hello, " + name));
    }
}
