package stringbuilder;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String originalstring = sc.nextLine().toLowerCase();
        StringBuilder builderstring = new StringBuilder();
        HashSet<Character> hashstr = new HashSet<>();

        for (int i = 0; i < originalstring.length(); i++) {
            Character ch = originalstring.charAt(i);
            if (!hashstr.contains(ch)) {
                builderstring.append(ch);
                hashstr.add(ch);
            }
        }
        System.out.println("After removing Duplicate elements: "+ builderstring.toString());
    }
}
