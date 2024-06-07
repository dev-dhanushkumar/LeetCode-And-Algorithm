#include<stdio.h>

// concatenate Array using so Global declaration
int k =0;

//Sorting Array
void insertionSort(int arr[], int n) {
    int key, i, j;
    for(i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while(j >= 0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}


// Separate and Insert Odd and Even Array Element
void separate_even_odd(int arr[], int n, int evenArr[], int oddArr[]) {
    int oddIndex = 0, evenIndex = 0;
    for(int i =0; i< n; i++) {
        if( arr[i] % 2 == 0) {
            evenArr[evenIndex] = arr[i];
            evenIndex++;
        } else {
            oddArr[oddIndex] = arr[i];
            oddIndex++;
        }
    }
    
    insertionSort(evenArr,evenIndex);
    insertionSort(oddArr, oddIndex);
}


//Join the Two Array
void concatenateArr(int arr[], int joinArr[], int n) {
    int i;
    for(i = 0; i < n ; i++) {
        arr[k] = joinArr[i];
        k++;
    }
}

//Display Array
void displayArr(int arr[], int n){
    for(int i =0; i<n ;i++) {
        printf("\t%d", arr[i]);
    }
}

void main() {
    int arr[17] = {7,35,12,98,32,98,23,48,17,83,92,57,64,26,51,29,5};

    // Find length of array
    int n = sizeof(arr)/sizeof(arr[0]);

    int evenCount = 0, oddCount = 0;
    
    //Get the odd and even array length to declare the Array
    for(int i = 0; i< n; i++) {
        if(arr[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    // odd and even Array Declaration
    int evenArr[evenCount];
    int oddArr[oddCount];

    // Function do other Operations
    separate_even_odd(arr,n,evenArr,oddArr);

    concatenateArr(arr,evenArr,evenCount );
    concatenateArr(arr,oddArr,oddCount );
    displayArr(arr, n);
}