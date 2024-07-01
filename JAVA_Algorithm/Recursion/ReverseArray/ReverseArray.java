import java.util.*;

class ReverseArray {

  public static void  printArray(int arr[], int len) {
    System.out.println("Reversed Array: ");
    for(int i = 0; i < len; i++) {
      System.out.println(arr[i] + " ");
    }
  }

  static void reverseArr(int arr[], int start, int end) {
    if(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      reverseArr(arr,start + 1, end - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter the Array Size: ");
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];

    for(int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }
    
    reverseArr(arr, 0, len - 1);
    printArray(arr,len);
  }
}
