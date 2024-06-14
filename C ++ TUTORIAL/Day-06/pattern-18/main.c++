#include<bits/stdc++.h>
using namespace std;

void pattern18(int n) {
    int ch = 69;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            cout << char(ch)<< " ";
            ch++;
        }
        ch = ch - (i + 1);
        cout << "\n";
    }
}



int main() {
    int c ;
    cout << "Enter the number of lines: ";
    cin >> c;
    pattern18(c);
    return 0;
}