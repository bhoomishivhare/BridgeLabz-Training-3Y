class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a palindrome.");
        else
            System.out.println(text + " is not a palindrome.");
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "Madam";

        p1.displayResult();
    }
}
