package Max_SubArray_Sum.Hashing_Approach;

import java.util.HashMap;
import java.util.Map;
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
        int subLen = getLargestSubarray(arr, len, sum);
        System.out.print("Largest Length of SubArray: "+subLen);
        sc.close();
    }

    private static int getLargestSubarray(int[] arr, int len, int sum) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int s = 0;
        int maxLen = 0;
        for (int i = 0; i < len; i++)  {
            s += arr[i];

            if(s == sum) {
                maxLen = Math.max(maxLen, i+1);
            }

            int rem  =  s - sum;
            if(preSumMap.containsKey(rem)) {
                int length = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, length);
            }

            if(!preSumMap.containsKey(s)) {
                preSumMap.put(s, i);
            }
        }
      return 0;
    }
}
