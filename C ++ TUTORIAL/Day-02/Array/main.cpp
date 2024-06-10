#include<bits/stdc++.h>
using namespace std;

int main() {
    int arr[5] = {0};


    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    cout << "arr[0] " << arr[0] << "\n";
    cout << "arr[1] " << arr[1] << "\n";
    cout << "arr[2] " << arr[2] << "\n";


    // Print Array Element
    for(int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }

    // Memory Element Address
    int* ptr = arr;

    cout << "\nMemory address of arr:" << &arr << "\n";

    cout << "Memory Addess of arr:" << ptr << "\n";

    ptr[3] = 100;
    cout << "arr[3] value:" << arr[3] << "\n";

    return 0;
}