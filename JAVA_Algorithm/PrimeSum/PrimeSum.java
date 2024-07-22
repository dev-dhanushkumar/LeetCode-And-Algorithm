package Prime_Sum;

import java.util.*;

class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 2; i < num; i++) {
            if(isPrime(i)){
                sum += i;
            }
        }
        sc.close();
        System.out.println("Sum of Prime Numbers: "+ sum);
    }

    static boolean isPrime(int num) {
        if(num == 2)
        return true;

        for(int i=2; i <= num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}