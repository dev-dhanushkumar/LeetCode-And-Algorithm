package Selection_Sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        int min_idx;
        for(int i = 0; i < n-1; i++) {
            min_idx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j]< arr[min_idx]) {
                    min_idx = j;
                }
            }

            if(min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
