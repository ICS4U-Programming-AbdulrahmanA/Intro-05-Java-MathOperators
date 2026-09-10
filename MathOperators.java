import java.util.Scanner;

public final class MathOperators {

    /**
     * Constant for cubing exponent.
     */
    private static final double CUBE_EXPONENT = 3.0;

    /**
     * Private class rule.
     */
    private MathOperators() {
    }

    /**
     *
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Math Operations Calculator");

        // addition
        System.out.println("\nAddition");
        System.out.print("Enter first number: ");
        double addNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double addNum2 = scanner.nextDouble();
        System.out.println(addNum1 + " + " + addNum2 + " = "
                + (addNum1 + addNum2));

        // subtraction
        System.out.println("\nSubtraction");
        System.out.print("Enter first number: ");
        double subNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double subNum2 = scanner.nextDouble();
        System.out.println(subNum1 + " - " + subNum2 + " = "
                + (subNum1 - subNum2));

        // multiplication
        System.out.println("\nMultiplication");
        System.out.print("Enter first number: ");
        double multNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double multNum2 = scanner.nextDouble();
        System.out.println(multNum1 + " * " + multNum2 + " = "
                + (multNum1 * multNum2));

        // division
        System.out.println("\nDivision");
        System.out.print("Enter numerator (dividend): ");
        double divNum1 = scanner.nextDouble();
        System.out.print("Enter denominator (divisor): ");
        double divNum2 = scanner.nextDouble();

        // checking division by zero
        if (divNum2 != 0) {
            float floatResult = (float) divNum1 / (float) divNum2;
            double doubleResult = divNum1 / divNum2;

            System.out.println("Float Result: " + floatResult);
            System.out.println("Double Result: " + doubleResult);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }

        // exponents
        System.out.println("\nExponents");
        System.out.print("Enter a number to square and cube: ");
        double baseNum = scanner.nextDouble();

        double powerOfTwo = Math.pow(baseNum, 2);
        double powerOfThree = Math.pow(baseNum, CUBE_EXPONENT);

        System.out.println(baseNum + " squared (^2) = " + powerOfTwo);
        System.out.println(baseNum + " cubed (^3)   = " + powerOfThree);

        // square root
        System.out.println("\nSquare Root");
        System.out.print("Enter a number to find its square root: ");
        double sqrtInput = scanner.nextDouble();

        if (sqrtInput >= 0) {
            double sqrtResult = Math.sqrt(sqrtInput);
            System.out.println("Square root of " + sqrtInput + " = "
                    + sqrtResult);
        } else {
            System.out.println("Error: Cannot calculate the square root "
                    + "of a negative real number.");
        }

        // close scanner
        scanner.close();
        System.out.println("\nCalculations complete!");
    }
}
