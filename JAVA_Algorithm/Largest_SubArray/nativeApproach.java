import java.util.*;

class NativeApproach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the Sum of SubArray: ");
    int k = sc.nextInt();
    sc.close();
    int res = getLongestSubArray(arr, k);
    System.out.println("Longest Subarray length is "+ res);
  }

  public static int getLongestSubArray(int[] arr, int k) {
    int n = arr.length;
    int len = 0;

    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        //add all the elements of
        long s  = 0;
        for(int k = i; k <= j; k++) {
          s +=arr[k];
        }

        if(s == k) {
          len = Math.max(len, j - i + 1);
        }
      }
    }
    return len;
  }
}
