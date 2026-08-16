import java.util.Scanner;

public class FinalValueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        int value = sc.nextInt();

        System.out.print("Enter value to add: ");
        int add = sc.nextInt();

        System.out.print("Enter value to multiply: ");
        int multiply = sc.nextInt();

        System.out.print("Enter value to subtract: ");
        int subtract = sc.nextInt();

        value = value + add;
        value = value * multiply;
        value = value - subtract;

        System.out.println("Final Value: " + value);

        sc.close();
    }
}
