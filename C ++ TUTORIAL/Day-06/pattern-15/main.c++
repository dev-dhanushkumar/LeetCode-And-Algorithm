#include<bits/stdc++.h>
using namespace std;

void pattern15(int n) {
    int ch = 65;
    for(int i = 0; i < n; i++) {
        for(int j = i; j < n; j++) {
            cout << char(ch) << " ";
            ch++;
        }
        ch = 65;
        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter the number of lines:";
    cin >> c;
    pattern15(c);
    return 0;
}