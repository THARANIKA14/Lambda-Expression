@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaArithmeticExample {
    public static void main(String[] args) {
        // Lambda for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda for division
        MathOperation division = (a, b) -> b != 0 ? a / b : 0;

        // Perform operations
        int x = 10, y = 5;

        System.out.println("Addition: " + addition.operate(x, y));
        System.out.println("Subtraction: " + subtraction.operate(x, y));
        System.out.println("Multiplication: " + multiplication.operate(x, y));
        System.out.println("Division: " + division.operate(x, y));
    }
}
