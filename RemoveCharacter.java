import java.util.*;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Character to remove: ");
        char rm = sc.next().charAt(0);

        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != rm) result += ch;
        }

        System.out.println("Modified String: " + result);
    }
}
