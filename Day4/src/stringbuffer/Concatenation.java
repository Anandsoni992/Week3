package stringbuffer;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] originalstring = new String[n+1];
        StringBuffer buffstring = new StringBuffer();
        for (int i = 0 ; i<=n ; i++) {
            originalstring[i] = sc.nextLine();
        }
        for(String str: originalstring){
            buffstring.append(str);
        }
        System.out.println("Concatenated String: " + buffstring.toString());

    }
}
