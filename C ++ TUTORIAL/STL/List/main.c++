#include<bits/stdc++.h>
using namespace std;

void explainList() {
    list<int> ls;
    ls.push_back(5);
    ls.emplace_back(4);
    ls.push_front(23);
    ls.emplace_front(45);
    for(auto it4: ls) {
        cout << it4 << " ";
    }
}

int main() {
    explainList();
    return 0;
}