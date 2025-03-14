import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, Lambda!");
    }
}
