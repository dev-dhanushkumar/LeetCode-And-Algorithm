#include <stdio.h>
#include <stdbool.h>

// Function to check if a number is a duck number
bool isDuckNumber(int num) {
    int divisor = 10;
    while (num > 0) {
        int digit = num % divisor;
        if (digit == 0)
            return false;
        num /= divisor;
    }
    return true;
}

// Function to find the length of an array
int getArrayLength(int arr[], int n) {
    int len = 0;
    while (arr[len] != 0 && len < n)
        len++;
    return len;
}

// Function to find the median of an array
int findMedian(int arr[], int n) {
    int len = getArrayLength(arr, n);
    int mid = len / 2;
    if (len % 2 == 0)
        return (arr[mid - 1] + arr[mid]) / 2;
    else
        return arr[mid];
}

// Function to separate duck numbers from an array
int separateDuckNumbers(int arr[], int n, int duckArr[]) {
    int duckIdx = 0;
    for (int i = 0; i < n; i++) {
        if (isDuckNumber(arr[i]))
            duckArr[duckIdx++] = arr[i];
    }
    return duckIdx;
}

// Function to print Array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main() {
    int n;
    printf("Enter the number of values to insert: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    int duckArr[n];
    int duckCount = separateDuckNumbers(arr, n, duckArr);

    printf("Duck numbers in the array: ");
    printArray(duckArr, duckCount);

    printf("Length of duck array: %d\n", duckCount);
    printf("Median of duck array: %d\n", findMedian(duckArr, duckCount));

    return 0;
}