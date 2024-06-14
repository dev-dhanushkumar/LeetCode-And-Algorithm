#include<bits/stdc++.h>
using namespace std;

void pattern11(int n) {
    int k = 1;
    for(int  i = 0; i < n; i++) {
        for(int j = 0; j <= i ; j++) {
            cout << k;
            if(k == 1)
            k = 0;
            else
            k = 1;
        }
        cout << "\n";
        (i%2 == 1)? k=1: k = 0;
    }
}

int main() {
    int c;
    cout << "Enter the line count: ";
    cin >> c;
    pattern11(c);
    return 0;
}