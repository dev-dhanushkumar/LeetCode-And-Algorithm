#include<bits/stdc++.h>
using namespace std;

void explainPair() {
    pair<int, int> p = {1,3};
    cout << p.first << " " << p.second;

    pair<int, pair<int, int>> n= {7,{3,5}};
    cout << "\n" << n.first << " " << n.second.first << " " << n.second.second;

    pair<int, int> arr[] = {{1,7}, {5,3}, {9,0}, {2,6}};
    cout <<"\n"<< arr[2].first;
}

int main() {
    explainPair();
    return 0;
}