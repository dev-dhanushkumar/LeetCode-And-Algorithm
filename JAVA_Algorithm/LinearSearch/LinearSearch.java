import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to Search: ");
        int k = sc.nextInt();
        sc.close();
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == k) {
                System.out.println("Given Element at index: "+ i);
                // break;
            } else{
                System.out.println("Searching...");
            }
        }
        
    }
}