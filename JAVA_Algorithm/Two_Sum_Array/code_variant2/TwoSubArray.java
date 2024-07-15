

import java.util.HashMap;
import java.util.Scanner;

class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
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

    private static String findTwoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeed = target - num;
            if(map.containsKey(moreNeed)) return "YES";

            map.put(arr[i], i);
        }
        return "NO";
    }
}
