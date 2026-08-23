public class ArrayConstructionProblems {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = i + 1;

        System.out.println("Constructed array:");
        for (int x : a)
            System.out.print(x + " ");
    }
}
