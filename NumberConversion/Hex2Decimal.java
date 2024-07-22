package Number_Conversions.Hex2Decimal;

import java.util.Scanner;

public class Hex2Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hex Value: ");
        String str = sc.nextLine();
        sc.close();

        // Hex To Decimal
        String digits = "0123456789ABCDEF";
        str = str.toUpperCase();
        int val = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = digits.indexOf(c);
            val = 16 * val + idx;
        }

        System.out.println("Decimal Value: "+ val);
    }
}
