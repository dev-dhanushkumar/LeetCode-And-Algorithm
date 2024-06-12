#include<bits/stdc++.h>
using namespace std;

void pattern4(int n) {
    for(int i =0; i< n; i++) {
        for(int j =0; j <= i; j++) {
            cout << i+1 << " ";
        }
        cout << "\n";
    }
}


int main() {
    int n;
    cout << "Enter the line values:"<< "\n";
    cin >> n;
    pattern4(n);
    return 0;
}