public class OnesComplementExample {
    public static void main(String[] args) {
        int num = 5;  // Binary: 00000000 00000000 00000000 00000101
        int onesComplement = ~num;

        System.out.println("Original number: " + num);
        System.out.println("One's Complement: " + onesComplement);
    }
}
