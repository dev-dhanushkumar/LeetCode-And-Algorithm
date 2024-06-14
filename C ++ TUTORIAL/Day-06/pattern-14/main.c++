#include<bits/stdc++.h>
using namespace std;

void pattern14(int n) {
    for(int i = 0; i < n; i++ ) {
        for(char ch = 'A'; ch <= 'A' + i; ch++) {
            cout << ch <<" ";
        }
        cout << "\n";
    }
}


int main() {
    int c;
    cout <<"Enter the lines of count:";
    cin >> c;
    pattern14(c);
    return 0;
}