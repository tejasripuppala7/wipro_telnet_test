public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        // More practical example
        int x = 10;
        int y = 20;

        System.out.println("x > 5 && y > 15: " + (x > 5 && y > 15)); // true
        System.out.println("x < 5 || y > 15: " + (x < 5 || y > 15)); // true
        System.out.println("!(x == y): " + !(x == y));               // true
    }
}
