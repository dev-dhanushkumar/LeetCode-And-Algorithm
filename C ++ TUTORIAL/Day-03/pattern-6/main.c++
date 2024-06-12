#include<bits/stdc++.h>
using namespace std;

void pattern6(int n) {
    for(int i = n; i > 0; i--) {
        for(int j = 0; j < i ; j++) { // j =0; j < n; j++
            cout << j+1 << " ";
        }
        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter the line count:" ;
    cin >> c;
    pattern6(c);
    return 0;
}