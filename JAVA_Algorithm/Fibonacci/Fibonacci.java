package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        sc.close();

        if(n == 0) {
            System.out.println(0);
        } else {
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for(int i = 2; i <=n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }

            for(int i=0; i <= n; i++) {
                System.out.print(arr[i]+"\t");
            }
        }
    }
}
