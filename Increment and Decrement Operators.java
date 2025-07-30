public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Post-increment
        System.out.println("a (post-increment): " + a++); // prints 5, then a becomes 6
        System.out.println("a after post-increment: " + a); // prints 6

        // Pre-increment
        System.out.println("++a (pre-increment): " + ++a); // a becomes 7, then prints 7

        // Post-decrement
        System.out.println("b (post-decrement): " + b--); // prints 10, then b becomes 9
        System.out.println("b after post-decrement: " + b); // prints 9

        // Pre-decrement
        System.out.println("--b (pre-decrement): " + --b); // b becomes 8, then prints 8
    }
}
