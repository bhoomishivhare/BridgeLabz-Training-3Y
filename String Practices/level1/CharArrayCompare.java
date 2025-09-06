import java.util.Scanner;

public class CharArrayCompare {

    public static char[] toCharArrayCustom(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] customArr = toCharArrayCustom(str);
        char[] builtinArr = str.toCharArray();

        System.out.println("Comparison result: " + compareCharArrays(customArr, builtinArr));
    }
}
