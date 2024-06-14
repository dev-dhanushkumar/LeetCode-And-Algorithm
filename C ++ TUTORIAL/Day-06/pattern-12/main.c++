#include<bits/stdc++.h>
using namespace std;

void pattern12(int n) {
    int k = 1, count = 2;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <=i; j++) {
            cout << j+1;
        }

        for(int j = 0; j < 2*n-(2*i+1); j++){
            cout << " " ;
        }

        for(int j = 0; j <=i; j++) {
            cout << k ;
            k--;
        }
        k = n - count;
        count--;
        cout << "\n";
    }
}

int main() {
    int c;
    cout << " Enter the linr count:";
    cin >> c;
    pattern12(c);
    return 0;
}