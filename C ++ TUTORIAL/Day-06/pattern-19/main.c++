#include<bits/stdc++.h>
using namespace std;

void pattern19(int N) {
    int iniS = 0;
    for (int i = 0; i < N; i++) {
        for(int j = 1; j <= N-i; j++) {
            cout << "*";
        }

        for(int j = 0; j<iniS; j++) {
            cout << " ";
        }

        for(int j = 1; j <= N-i; j++) {
            cout << "*";
        }
        iniS += 2;
        cout << "\n";
    }

    iniS = (2*N) - 2;
    for (int i = 1; i <= N; i++) {
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }

        for(int j = 0; j<iniS; j++) {
            cout << " ";
        }

        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        iniS -= 2;
        cout << "\n";
    }
    
}


int main() {
    int c;
    cout << "Enter the lines count: ";
    cin >> c;
    pattern19(c);
    return 0;
}