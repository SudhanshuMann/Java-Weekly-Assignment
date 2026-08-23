public class BitMaskUtility {
    public static void main(String[] args) {
        int n = 10;
        int position = 1;

        int mask = 1 << position;

        System.out.println("Set bit: " + (n | mask));
        System.out.println("Clear bit: " + (n & ~mask));
        System.out.println("Toggle bit: " + (n ^ mask));
    }
}
