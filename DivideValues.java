import java.util.Scanner;

public class DivideValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        double first = input.nextDouble();
        System.out.print("Enter the denominator: ");
        double second = input.nextDouble();

        try {
            if (second == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            double result = first / second;
            System.out.printf("%.2f / %.2f = %.2f%n", first, second, result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
