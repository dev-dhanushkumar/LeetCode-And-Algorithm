import java.util.*;

class StackBuySell {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int maxPro = maxPro(arr);
    System.out.println("Max Profit is: " + maxPro);
  }

  static int maxPro(int[] arr) {
    int maxPro = 0;
    for (int i = 0; i < max; i++) {
      for (ini j= i+1; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          maxPro = Math.max(arr[j] - arr[i], maxPro);
        }
      }
    }
    return maxPro;
  }
}
