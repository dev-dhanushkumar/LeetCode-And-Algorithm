#include<stdio.h>

// Find the Repeated count and reduce the window size
void repeatedCount(int arr[], int start, int end, int k) {
    int count = k;
    for(int i = start; i < end-1; i++) {
        for(int j =i+1; j< end; j++) {
            if(arr[i] == arr[j]) {
                count--;
            }
        }
    }
    printf("\n");
    printf("Distinct count of Window : %d",count);
}

// To find array start and End Point to give repeated function
void slideWindow(int arr[], int n, int k) {
    if(k > n) {
        printf("Sorry! Couldn't perform the Sliding Window Operarion to want n > k");
    }

    for(int i =0; i < n-k+1; i++ ) {
        repeatedCount(arr,i, i+k, k); // repeatedCount(arr, startIndex, endIndex, window_Size)
    }
}

int main() {
    int arr[] = {1,2,1,3,4,2,3,4,6,1,8,3,1,5,2,4,8};

    int len = sizeof(arr)/sizeof(arr[0]);
    int k = 4;
    slideWindow(arr, len, k);
    return 0;
}