package RemoveDuplicate;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        arr = sorting(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k = removeDuplicate(arr);
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] sorting(int[] arr, int n) {
        int mid_idx;
        for(int i = 0; i < n-1; i++) {
            mid_idx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[mid_idx]) {
                    mid_idx = j;
                }
            }
            if(mid_idx != i) {
                int temp = arr[i];
                arr[i] = arr[mid_idx];
                arr[mid_idx] = temp;
            }
        }
        return arr;
    }

    static int removeDuplicate(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}