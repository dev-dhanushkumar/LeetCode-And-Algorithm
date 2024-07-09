package String_Palindrome;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if(isPalindrome(str)){
            System.out.println("given string is Palindrome");
        } else {
            System.out.println("given string is not Palindrome");
        }

    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
