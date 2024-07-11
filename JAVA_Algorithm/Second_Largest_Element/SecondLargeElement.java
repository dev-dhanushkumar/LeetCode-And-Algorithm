package Second_Large_Element;

import java.util.Scanner;

public class SecondLargeElement {

    public static int seconeLarge(int[] arr, int n) {
        int seconeLarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > large){
                seconeLarge = large;
                large = arr[i];
            } else if(seconeLarge < arr[i] && arr[i] != large){ 
                seconeLarge = arr[i];
            }
        }
        return seconeLarge;
    }

    public static int secondSmall(int[] arr, int n) {
        if(n < 2)
        return -1;

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if(arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Second Largest Element:"+ seconeLarge(arr, n));
        System.out.println("Second Smallest Element:"+ secondSmall(arr, n));
    }
}
