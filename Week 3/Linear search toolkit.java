public class LinearSearchToolkit {
    public static void main(String[] args) {
        int[] a = {10, 25, 30, 45, 50};
        int target = 30;
        int position = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.println("Element found at index " + position);
        else
            System.out.println("Element not found");
    }
}
