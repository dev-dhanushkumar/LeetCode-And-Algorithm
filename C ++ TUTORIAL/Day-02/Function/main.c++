#include<bits/stdc++.h>
using namespace std;

// Functions are set of code which perform somethings or you
// Function are used to modularise code
// Functiom are used to increase readability 
// Function are used to use same code multiple times
// void ->does not return anything
// return
// parameterised
// non parameterised

int max(int x, int y) { // Formal Parameter
    if(x > y)
        return x;
    else
        return y;
}
int main() {
    int a = 10, b = 30;
    int m = max(a,b); //Actual Parameter


    cout << "M is : " << m;
    return 0;
}