import java.util.Scanner;

public class UppercaseConversion {

    public static String toUpperCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32); // convert to uppercase
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

        String upperCustom = toUpperCustom(text);
        String upperBuiltIn = text.toUpperCase();

        System.out.println("Custom Uppercase: " + upperCustom);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Comparison: " + compareStrings(upperCustom, upperBuiltIn));
    }
}
