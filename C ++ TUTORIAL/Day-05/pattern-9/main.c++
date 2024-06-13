#include<bits/stdc++.h>
using namespace std;

void pattern9(int n) {
    for(int i = 1; i <= n; i++) {
        for(int j = i; j < n ; j++) {
            cout << " ";
        }

        for(int k = 1; k < (i*2); k++) {
            cout << "*";
        }
        cout << "\t\n";
    }

    for(int i = n; i >= 1; i-- ) {
        for(int j = 5; j > i; j--) {
            cout << " ";
        }

        for(int k = 1; k < (i*2); k++) {
            cout << "*";
        }
        cout << "\t\n";
    }

}


int main() {
    int c;
    cout << "Enter the count of lines:";
    cin >> c;
    pattern9(c);
    return 0;

}