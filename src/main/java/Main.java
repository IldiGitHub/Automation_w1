public class Main {
    public static void main (String[] args) {
        double a = 3;
        double b = 2;
        System.out.println("Addition: " + a + " + " + b + " = " + Calculator.addition(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + Calculator.subtraction(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + Calculator.multiplication(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + Calculator.division(a, b));
    }
}
