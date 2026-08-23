public class ArrayTransformations {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int n : a)
            System.out.print(n + " ");

        System.out.println("\nTransformed array:");
        for (int n : a)
            System.out.print((n * 2) + " ");
    }
}
