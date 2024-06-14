#include<bits/stdc++.h>
using namespace std;

void pattern17(int n) {
    for(int  i = 0; i < n; i++) {
        for(int j = i; j <= n; j++) {
            cout << " ";
        }

        char ch= 'A';
        int breakpoint = (2*i+1)/2;
        for(int j = 1; j <= (i*2+1); j++) {
            cout << ch;
            if(j <= breakpoint) ch++;
            else ch--;
        }

        cout << "\n";
    }
}

int main() {
    int c;
    cout << "Enter the lines Count: ";
    cin >> c;
    pattern17(c);
    return 0;
}