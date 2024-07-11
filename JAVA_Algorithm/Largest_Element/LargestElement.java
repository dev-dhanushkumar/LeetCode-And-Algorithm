package Largest_Element_Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int large = arr[0];
        for(int i = 1; i < n; i++) {
            if(large < arr[i]) {
                large = arr[i];
            }
        }

        System.out.println("Largest Element in Array: "+ large);
    }
}