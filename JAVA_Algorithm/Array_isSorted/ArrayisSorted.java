package isSorted;

import java.util.Scanner;

public class ArrayisSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();


        //isSorted Logic
        boolean sort = true;
        for(int i= 0; i < n-1 ; i++) {
            if(arr[i] > arr[i+1]) {
                sort = false;
            }
        }

        if(sort) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not  Sorted");
        }
    }
}
