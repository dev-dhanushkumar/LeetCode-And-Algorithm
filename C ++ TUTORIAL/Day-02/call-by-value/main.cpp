#include<bits/stdc++.h>
using namespace std;

void fun(int x) {
    x = x+5;
    cout << "X value in fun:" << x << "\n";
}

int main() {
    int x =10;
    fun(x); // only copy of values could be send -> fun(x)
    cout << "X value in main:" << x << "\n";
}