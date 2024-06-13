#include<bits/stdc++.h>
using namespace std;

void pattern10(int n) {
    for(int i = 0; i <= n; i++) {
        for(int j = 0; j < i ; j++) {
            cout << "*";
        }
        cout << "\n";
    }

    for(int i = n; i > 1; i--) {
        for(int j = i; j > 1 ; j--) {
            cout << "*";
        }
        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter the line count:";
    cin >> c;
    pattern10(c);
    return 0 ;
}