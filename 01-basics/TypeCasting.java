public class TypeCasting {

    public static void main(String[] args) {

        // Widening casting
        int number = 100;
        double decimalNumber = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);

        // Narrowing casting
        double value = 99.99;
        int convertedValue = (int) value;

        System.out.println("Double: " + value);
        System.out.println("Integer after casting: " + convertedValue);
    }
}
