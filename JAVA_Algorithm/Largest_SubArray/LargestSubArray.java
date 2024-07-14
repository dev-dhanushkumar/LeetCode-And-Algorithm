package JAVA_Algorithm.Largest_SubArray;

import java.util.*;


public class LargestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Sum of sub Array: ");
        int k = sc.nextInt();
        sc.close();
        int res = getLongestSubArray(arr, k);
        System.out.println(res);
    }

    private static int getLongestSubArray(int[] arr, int k) {
        int n = arr.length;

        int left = 0, right  = 0;
        int sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right < n ) sum += arr[right];
        }
        return maxLen;
    }
}