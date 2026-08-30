public class StringFundamentals {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("Substring: " + text.substring(5));
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Replace: " + text.replace("Java", "Python"));
    }
}
