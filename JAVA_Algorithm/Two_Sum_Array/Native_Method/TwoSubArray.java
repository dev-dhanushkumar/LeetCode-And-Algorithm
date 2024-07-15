package Two_Sum_Array.Native_Method;

import java.util.*;

class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Sum of two values: ");
        int k = sc.nextInt();
        sc.close();
        String res = findTwoSum(arr, k);
        System.out.println(res);
    }

    private static String findTwoSum(int[] arr, int k) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]== k) return "YES";
            }
        }
        return "NO";
    }
}