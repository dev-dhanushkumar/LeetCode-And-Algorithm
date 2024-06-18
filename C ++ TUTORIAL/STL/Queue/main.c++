#include<bits/stdc++.h>
using namespace std;

void explainQueue() {
    queue<int> q;
    q.push(67);
    q.push(82);
    q.emplace(34);
    q.back() += 6;
    cout << q.back();
    cout << "\n" << q.front();
    q.pop();
    cout << "\n" << q.front();

    // size swap empty same as stack
}

int main() {
    explainQueue();
    return 0;
}