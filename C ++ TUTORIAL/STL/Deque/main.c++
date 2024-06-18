#include<bits/stdc++.h>
using namespace std;

void explainDeque() {
    deque<int> dq;
    dq.push_back(67);
    dq.emplace_back(53);
    dq.push_front(23);
    dq.emplace_front(47);

    for(auto it4: dq) {
        cout << it4 << " ";
    }
    cout << "\n";
    dq.pop_back();
    dq.pop_front();
    for(auto it4: dq) {
        cout << it4 << " ";
    }

    // Print the last element
    cout << "\n" << dq.back();

    // Print the first element
    cout << "\n" << dq.front();
}

int main() {
    explainDeque();
    return 0;
}

