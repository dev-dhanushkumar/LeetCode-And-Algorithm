#include<bits/stdc++.h>
using namespace std;

void pattern20(int n) {
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        for(int j = 1; j <= (n*2) -(i*2); j++){
            cout << " ";
        }
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << "\n";
    }
    int ini = 1;    
    for(int i = n-1; i > 0; i--) {
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        for(int j = 1; j <= 2*ini; j++){
            cout << " ";
        }
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        ini++;
        cout << "\n";
    }
}


int main() {
    int c;
    cout << "Enter the lies count: ";
    cin >> c;
    pattern20(c);
    return 0;
}