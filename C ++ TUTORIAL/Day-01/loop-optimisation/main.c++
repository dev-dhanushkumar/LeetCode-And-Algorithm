#include<iostream>
using namespace std;

int main() {
    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 6;

    for(int num : numbers) {
        if(num == target) {
            cout << "Target found:" << target << "\n";
            break;
        }
        cout << "Checking: " << num << "\n";
    }

    for (int num  : numbers) {
        if ( num % 2 == 0) {
            continue;
        }
        cout << "Odd numbers: " << num << "\n";
    }
}