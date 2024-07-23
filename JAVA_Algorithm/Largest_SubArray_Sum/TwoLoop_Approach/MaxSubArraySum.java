package Max_SubArray_Sum.Two_Loop_Approach;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Subarray sum: ");
        int sum = sc.nextInt();
        int subLen = getLArgestSubarray(arr, len, sum);
        System.out.print("Largest Length of SubArray: "+subLen);
        sc.close();
    }

    private static int getLArgestSubarray(int[] arr, int len, int sum) {
        int length = 0;
        for(int i = 0; i < len; i++) {
            int s = 0;
            for(int j = i; j < len; j++) {
                s += arr[j];
                if(s == sum) {
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }
}
