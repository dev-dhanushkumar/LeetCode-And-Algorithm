#include<stdio.h>

int maxSum(int arr[], int n, int k) {
    if(n < k) {
        printf("Sorry! Couldn't Perform the Sliding window Operation");
        return 0;
    }

    int max_sum =0;
    for(int i = 0; i < k; i++) {
        max_sum += arr[i];
    }

    int window_val = max_sum;
    for(int i = k; i < n; i++) {
        window_val += arr[i] - arr[i - k];
        max_sum = (window_val > max_sum)? window_val:max_sum;
    }

    return max_sum;
}


int main() {
    int arr[] = {45,2,4,8,89,6,1,97,36, 53,21,97,43,34,12,45,87,90,22,12,89,46,2,24,13,78,34,77,23,66,11,8,23,1,76,99,43,77,45,14,67,3,96,34,23};

    int len = sizeof(arr) / sizeof(arr[0]) ;

    int k = 4;

    printf("Maximum sum Value: %d", maxSum(arr, len, k) );

    // Time Complexity: O(n), where n is the size of input array arr[].
    // Auxiliary Space: O(1)
}