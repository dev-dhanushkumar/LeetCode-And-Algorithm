#include<bits/stdc++.h>
using namespace std;

void pattern16(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <= i; j++) {
            cout << char(65+i) << " ";
        }
        cout << "\n";
    }
}


int main() {
    int c;
    cout << "Enter the lines count: ";
    cin >> c;
    pattern16(c);
    return 0;
}