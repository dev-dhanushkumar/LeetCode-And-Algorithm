import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter element to Search: ");
        int key = scanner.nextInt(); 
        scanner.close();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        int idx = binarySearch(arr,0 ,n,key);
        if(idx == -1) System.out.println("\nElement Not present");
        else System.out.println("\nElement present at position: "+idx);
    }

    // Time Complexity = O(1)
    // Space complexity  = O(1)
    public static int binarySearch(int[] arr, int low, int high, int k) {
        int mid = low + (high  - low) /2;
        
        if(arr[mid] == k) return mid;

        if(arr[mid] > k) return binarySearch(arr, low, mid - 1, k);

        if(arr[mid] < k) return binarySearch(arr, mid+1, high, k);
        return -1;
    }
    
}