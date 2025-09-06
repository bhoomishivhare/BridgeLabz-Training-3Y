import java.util.Scanner;

public class CompareStrings {
    
    public static boolean compareCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.next();
        System.out.print("Enter second string: ");
        String str2 = input.next();

        boolean resultCharAt = compareCharAt(str1, str2);
        boolean resultEquals = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);
    }
}
