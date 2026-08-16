import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        int digits = 0;

        while (n != 0) {
            sum += n % 10;
            digits++;
            n /= 10;
        }

        System.out.println("Number: " + original);
        System.out.println("Number of Digits: " + digits);
        System.out.println("Sum of Digits: " + sum);

        if (original % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        sc.close();
    }
}
