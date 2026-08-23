import java.util.*;

public class ArrayStatistics {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int sum = 0, max = a[0], min = a[0];

        for (int n : a) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        double average = (double) sum / a.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
