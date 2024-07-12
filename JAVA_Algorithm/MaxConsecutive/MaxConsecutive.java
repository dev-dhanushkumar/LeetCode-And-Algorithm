package Max_Consecutive;

import java.util.Scanner;

public class MaxConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println("The Maximum consecutive 1's are "+ ans);
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            max = Math.max(max, cnt);
        }
        return max;
    }
}
