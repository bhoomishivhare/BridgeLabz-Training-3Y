import java.util.Scanner;

public class LowercaseConversion {

    public static String toLowerCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); // convert to lowercase
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        String lowerCustom = toLowerCustom(text);
        String lowerBuiltIn = text.toLowerCase();

        System.out.println("Custom Lowercase: " + lowerCustom);
        System.out.println("Built-in Lowercase: " + lowerBuiltIn);
        System.out.println("Comparison: " + compareStrings(lowerCustom, lowerBuiltIn));
    }
}
