#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

//Sorting Array
void insertionSort(int arr[], int n, int i) {
    for(i; i < n-1; i++) {
        int min_idx = i;
        for(int j= i+1; j < n; j++ ) {
            if(arr[j] < arr[min_idx]) {
                min_idx = j;
            }
        }
        swap(&arr[i], &arr[min_idx]);
    }
}

void sortArray(int arr[], int n) {
    int low = 0, mid = 0, high = n - 1;

    while (mid <= high) {
        if (arr[mid] % 2 == 0) {
            swap(&arr[mid], &arr[low]);
            low++;
            mid++;
        } else {  // arr[mid] is odd
            swap(&arr[mid], &arr[high]);
            high--;
        }
    }

    insertionSort(arr, mid, 1);
    insertionSort(arr, n, mid);
}

int main() {
    int arr[] = {5,4,3,7,8,3,2,5};
    int n = sizeof(arr) / sizeof(arr[0]);

    sortArray(arr, n);

    printf("\n");
    // Print the sorted array
    printf("Sorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}