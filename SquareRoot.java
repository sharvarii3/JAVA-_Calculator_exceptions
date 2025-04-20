public class SquareRoot {
    public static void squareRoot(double a) {
        try {
            if (a < 0) throw new ArithmeticException("Cannot find square root of a negative number");
            System.out.println("Square Root: " + Math.sqrt(a));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
