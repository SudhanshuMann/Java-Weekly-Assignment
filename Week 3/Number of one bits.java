public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n = n >> 1;
        }

        System.out.println("Number of 1 bits = " + count);
    }
}
