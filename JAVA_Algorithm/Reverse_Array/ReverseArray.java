package reverse_Array;

import java.util.Scanner;

// import java.util.*;
class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Before Reverse: ");
        for(int i = 0; i < n; i++) {
            System.out.print("index: "+i+" value is "+arr[i]+"\n");
        }
        arr = reArray(arr);
        System.out.println("After Reverse: ");
        for(int i = 0; i < n; i++) {
            System.out.print("index: "+i+" value is "+arr[i]+"\n");
        }
    }

    public static  int[] reArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
    }
}