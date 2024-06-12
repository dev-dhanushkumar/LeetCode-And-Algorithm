#include<bits/stdc++.h>
using namespace std;

void pattern1(int n) {
    for(int i = 0; i< n; i++) {
        for(int j =0; j < n; j++) {
            cout << "* ";
        }
        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter number of lines in patern:" << "\n";
    cin >> c;
    pattern1(c);
    return 0;
}