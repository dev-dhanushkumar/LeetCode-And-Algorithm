#include<stdio.h>

//find number of digit
int digitLen(long int num) {
    int len = 0;
    while(num> 0) {
        len++;
        num /= 10;
    }

    return len;
}

// Swaping variable
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

//Sorting Array
void selectionSort(int arr[], int n, int i) {
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

//Display Array
void displayArr(int arr[], int n){
    for(int i =0; i<n ;i++) {
        printf("\t%d", arr[i]);
    }
}

// Odd arrange in right side and even arrange in left side
void arraySlice(int arr[], int n) {
    int low = 0, mid = 0, high = n - 1;

    while (mid <= high) {
        if (arr[mid] % 2 == 0) {
            swap(&arr[mid], &arr[low]);
            low++;
            mid++;
        } else {  
            swap(&arr[mid], &arr[high]);
            high--;
        }
    }

    //Before sorting mid Check
    printf("\nAfter Array slice:");
    printf("\n\n");
    displayArr(arr,n);

    // Sorting Array mid and end values
    selectionSort(arr, mid, 0);
    selectionSort(arr, n, mid);
}


void main() {
    long int n  = 83143765;

    // Get length of digit
    int len = digitLen(n);

    // Declaration arr 
    int arr[len];

    // Get odd Array and Even Array length
    int rem = 0;
    for(int i = 0; n > 0; i++) {
        rem = n % 10;
        arr[i] = rem;
        n /= 10;
    }

    // Initial array Display
    printf("Initial digit Array:");
    printf("\n\n");
    displayArr(arr,len);

    // displayArr(arr,len);
    arraySlice(arr,len);

    //display array function call
    printf("\n");
    printf("\nFinal Sorted Array even follow odd:");
    printf("\n\n");
    displayArr(arr,len);

}