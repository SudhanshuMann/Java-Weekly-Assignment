public class XorArrayProblems {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};

        int result = 0;

        for (int n : a)
            result ^= n;

        System.out.println("XOR = " + result);
    }
}
