#include<bits/stdc++.h>
using namespace std;

void pattern7(int n) {
    for(int i =1; i <= n; i++) {
        for(int j = 1; j < n-i; j++) {
            cout << " ";
        }


        for(int k = 1; k <= 2* i -1; k++) {
            cout << "*";
        }
        cout << "\n";
    }
}


int main() {
    int c;
    cout << "Enter the number of lines:" ;
    cin >> c;
    pattern7(c);
    return 0;
}