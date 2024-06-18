#include<bits/stdc++.h>
using namespace std;

int main() {
    multiset<int> ms; // Here Sorted element are presented and Not working Unique
    ms.insert(1);
    ms.insert(1);
    ms.insert(1);
    ms.insert(1);
    ms.erase(ms.find(1));
    for(auto ele: ms) {
        cout << ele << " ";
    }

    ms.insert(2);
    ms.insert(2);
    cout << "\n";
    for(auto ele: ms) {
        cout << ele << " ";
    }
    cout << "\n";
    ms.erase(ms.find(1), ms.find(2));
    for(auto ele: ms) {
        cout << ele << " ";
    }

    //Rest of all same in set
    return 0;
}