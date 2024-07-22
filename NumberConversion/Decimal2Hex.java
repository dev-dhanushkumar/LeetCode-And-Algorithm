package Number_Conversions.Decimal2Hex;

import java.util.*;
public class Decimal2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        int dec = sc.nextInt();
        sc.close();

        // Decimal To Hex
        String digits = "0123456789ABCDEF";
        if(dec == 0) System.out.println("Hex decimal Value: 0");

        String hex ="";
        while (dec > 0) {
            int digit = dec % 16;
            hex = digits.charAt(digit) + hex;
            dec /= 16;
        }

        System.out.println("Hex decimal Value: "+ hex);
    }
}
