#include<iostream>
using namespace std;

int main () {
    int x = 2;
    int y = 3;

    switch(x) {
        case 2 :
            cout << "X is 1." << "\n";
            switch (y) {
                case 1:
                    cout << "y is 1." << "\n";
                default:
                    cout<< "y is not 1" << "\n";
            }
            break;
        default:
            cout << "X is not 1" << "\n";
    }
    return 0;
}