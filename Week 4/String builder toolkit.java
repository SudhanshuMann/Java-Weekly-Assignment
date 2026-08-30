public class StringBuilderToolkit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Advanced ");
        System.out.println("After insert: " + sb);

        sb.replace(5, 14, "Basic");
        System.out.println("After replace: " + sb);

        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
