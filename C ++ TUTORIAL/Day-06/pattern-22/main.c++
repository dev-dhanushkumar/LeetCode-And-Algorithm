#include<bits/stdc++.h>
using namespace std;

void pattern22(int n) {
    for(int i = 0; i < 2*n; i++) {
        for(int j = 0; j < 2*n-1; j++) {
            int top = i;
            int bottom = j;
            int right = (2 * n - 2) - j;
            int left = (2 * n -2) - i;

            cout << (n - min(min(top,bottom),min(right,left))) << " ";
        }
        cout << "\n";
    }
}


int main() {
    int c;
    cout << "Enter the lines count:";
    cin >> c;
    pattern22(c);
    return 0;
}