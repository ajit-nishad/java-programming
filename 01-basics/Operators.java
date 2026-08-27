public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        System.out.println("AND: " + (a > 10 && b < 20));
        System.out.println("OR: " + (a > 10 || b > 20));
        System.out.println("NOT: " + !(a > b));
    }
}
