package Max_SubArray_Sum.Native_Approach;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            for(int j = i; j < len; j++) {
                int s = 0;
                for(int k = i; k <= j; k++) {
                    s += arr[k];
                }

                if(s == sum) {
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }
}
