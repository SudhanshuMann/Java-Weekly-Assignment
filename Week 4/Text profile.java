public class TextProfile {
    public static void main(String[] args) {
        String text = "Java is a powerful programming language";

        int characters = text.length();
        int words = text.trim().split("\\s+").length;
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Text: " + text);
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
    }
}
