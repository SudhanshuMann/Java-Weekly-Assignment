public class ArrayPointerProblems {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
