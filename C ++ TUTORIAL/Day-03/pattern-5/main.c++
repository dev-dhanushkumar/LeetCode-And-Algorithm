#include<bits/stdc++.h>
using namespace std;

void pattern5(int n) {
    for(int i = 0; i< n; i++) {
        for(int j = n;j > i; j--) {
            cout << "*" << " ";
        }
        cout << "\n";
    }
}

int main() {
    int n;
    cout << "Enter the line count:"<< "\n";
    cin >> n;
    cout << "\n";
    pattern5(n);
    return 0;
}