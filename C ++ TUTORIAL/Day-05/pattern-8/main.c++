#include<bits/stdc++.h>
using namespace std;

void pattern8(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <=i; j++) {
            cout << " " ;
        }

        for(int j = 0; j < 2*n-(2*i+1); j++){
            cout << "*" ;
        }

        for(int j = 0; j <=i; j++) {
            cout << " " ;
        }
        cout << "\n";
    }
}

int main() {
    int c;
    cout << " Enter the lines count: ";
    cin >> c;
    pattern8(c);
    return 0;
}

//Formula 2n(2i + 1)