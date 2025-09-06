import java.util.Scanner;

public class UniqueCharacters {

    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = c;
        }

        char[] result = new char[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] unique = uniqueCharacters(str);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
