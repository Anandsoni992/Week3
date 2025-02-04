package stringbuilder;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String originalstring = sc.nextLine();
        StringBuilder builderstring = new StringBuilder(originalstring);
        builderstring.reverse();
        System.out.println("The reverse string is : "+ builderstring.toString());
    }

}
