public class QuadraticCalculator {

    public static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        System.out.println("Solving equation: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions are real and distinct: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            System.out.println("One real solution: x1 = " + x1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex solutions: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
