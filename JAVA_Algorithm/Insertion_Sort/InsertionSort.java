package Insertion_Sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Sorting...");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "\t");
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = i; j < n; j ++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting...");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
