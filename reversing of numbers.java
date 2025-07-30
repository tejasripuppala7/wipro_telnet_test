public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;       // get last digit
            reversed = reversed * 10 + digit;
            number = number / 10;          // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
