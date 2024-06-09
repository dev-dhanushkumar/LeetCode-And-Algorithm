#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

bool checkGoodSubarray(int nums[], int numsSize, int k);

bool sumOfElem(int arr[], int len, int k) {
    int sum = 0;
    for(int i =0; i < len; i++) {
        sum += arr[i];
    }
    
    if((sum % k) == 0) {
        return true;
    } else {
        return false;
    }

}

bool subArrSum(int arr[], int len, int k) {

    int currentSum  = arr[0], start = 0, i;

    for(i = 1; i <= len; i++) {
        while(currentSum > k && start < i -1) {
            currentSum = currentSum - arr[start];
            start++;
        }

        if(currentSum == k) {
            printf("Sum found between the index %d and %d", start, i -1);
            return sumOfElem(arr,len,k);
        }

        if( i< len)
            currentSum = currentSum + arr[i];
    }
    printf("No subarray Found");

    return 0;
}



bool checkSubarraySum(int* nums, int numsSize, int k) {
    int sum = 0;
    int* mod_sum = calloc(k, sizeof(int));
    mod_sum[0] = -1;  // Initialize -1 for the case when the entire array has a sum divisible by k

    if( numsSize == 1) {
        return false;
    }
    for (int i = 0; i < numsSize; i++) {
        sum += nums[i];

        // Take the modulo to handle large values
        if (k != 0) {
            sum %= k  ;
        }

        if (mod_sum[sum] != 0) {
            // If the current sum modulo k exists in the array,
            // it means there is a subarray with sum divisible by k
            if (i - mod_sum[sum] > 2) {
                free(mod_sum);
                return true;
            }
        } else {
            mod_sum[sum] = i+1;  // Store the index of the current sum modulo k
        }
    }

    free(mod_sum);
    return false;
}


int main() {
    int arr[] = {0,1,0,3,0,4,0,4,0}; 

    int len = sizeof(arr) / sizeof(arr[0]);

    bool res = checkSubarraySum(arr,len, 5);

    printf("\n%d", res);

}


bool checkGoodSubarray(int nums[], int numsSize, int k) {
    int* mod_sum = calloc(k, sizeof(int));
    mod_sum[0] = -1;

    int sum = 0;

    for(int i = 0; i < numsSize; i++) {
        sum += nums[i];

        int rem = sum % k;

        if(mod_sum[rem] != 0);
    }
    return true;
}
