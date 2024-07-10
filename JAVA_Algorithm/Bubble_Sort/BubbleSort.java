package Bubble_Sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Before Sorting...");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "\t");
        }
        boolean swapped;
        for(int i = 0; i < n-1; i++) {
            swapped = false;
            for(int j = 0; j < n-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false) {
                break;
            }
        }
        System.out.println();
        System.out.println("After Sorting...");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "\t");
        }
        sc.close();
    }
}
