#include<bits/stdc++.h>
using namespace std;

void pattern13(int n) {
    int k =1;
    for(int i = 0; i< n ; i++) {
        for(int j = 0; j <= i; j++) {
            cout << k << " ";
            k++;
        }
        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter the line Count: ";
    cin >> c;
    pattern13(c);
    return 0;
}