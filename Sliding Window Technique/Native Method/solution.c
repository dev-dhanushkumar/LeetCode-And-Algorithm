#include<stdio.h>
#include<limits.h>

int max(int num1, int num2) {
    return (num1 > num2)? num1: num2;
}

int maxSum(int arr[], int n, int k) {
    if(n < k) {
        printf("Could't perform Sliding Window Technique");
        return 0;
    }

    int max_sum = INT_MIN;

    for(int i =0; i < n-k+1; i++) {
        int slide_sum = 0;
        for(int j =0; j < k; j++) {
            slide_sum += arr[i + j];
        }

        max_sum = max(slide_sum, max_sum);
    }

    return max_sum;
}

int main() {
    int arr[]  = {45,2,4,8,89,6,1,97,36,53,21,97,43,34,12,45,87,90,22,12,89,46,2,24,13,78,34,77,23,66,11,8,23,1,76,99,43,77,45,14,67,3,96,34,23};

    // Get Array length
    int n = sizeof(arr) / sizeof(arr[0]);

    // Sliding Size declartion
    int k = 4;

    printf("Max Sum in Array: %d", maxSum(arr, n, k));
    return 0;

    // Time complexity: O(k*n) as it contains two nested loops.
    // Auxiliary Space: O(1)
}