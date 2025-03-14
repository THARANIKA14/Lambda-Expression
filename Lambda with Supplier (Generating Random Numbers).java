import java.util.function.Supplier;
import java.util.Random;

public class LambdaSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println("Random Number: " + randomNumber.get());
    }
}
