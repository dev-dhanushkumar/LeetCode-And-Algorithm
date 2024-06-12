#include<bits/stdc++.h>
using namespace std;

void pattern3(int n) {
    for(int i = 0; i < n ; i++) {
        for(int j= 0; j <=i; j++) {
            cout <<j+1 << "\t" ;
        }
        cout << "\n";
    }
}

int main() {
    int n;
    cout << "Enter the number of lines:" << "\n";
    cin >> n;
    cout << "\n";
    pattern3(n);
    return 0 ;
}