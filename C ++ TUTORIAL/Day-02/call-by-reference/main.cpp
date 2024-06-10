#include<bits/stdc++.h>
using namespace std;

void fun(int &x) { // using the address to change x value in global function
    x = x+5;
    cout << "X value in fun:" << x << "\n";
    x = x+5;
}
int main() {
    int x =10;
    cout << "First x value: " << x << "\n";
    fun(x);
     cout << "After x value: " << x << "\n";
    return 0;
}