import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Flowers: ");
        int N = sc.nextInt();
        System.out.print("\nEnter the needed flowers: ");
        int t = sc.nextInt();
        int[] arr = new int[N];
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == 0) break;

                if(arr[i] <= arr[j]) {
                    if((arr[i] + arr[j]) == t) {
                        System.out.print("\nRequired Index: "+i+" and "+j);
                    }
                }
            }
        }

    }
}