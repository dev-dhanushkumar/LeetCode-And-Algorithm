#include<bits/stdc++.h>
using namespace std;

void explainPriorityQueue() {
    priority_queue<int> pq;
    pq.push(5); /// {5}
    pq.push(2); // {5,2}
    pq.emplace(8); // {8,5,2}
    pq.emplace(10); // {10,8,5,2}
    cout << pq.top();

    pq.pop();
    cout << "\n" << pq.top();
    // note: Above call it as MAX Heap
    // Size, empty and swap same as stack





    //MIN Heaping
    priority_queue<int, vector<int>, greater<int>> pq1;
    pq1.push(5);
    pq1.push(2);
    pq1.emplace(8);
    pq1.emplace(10);
    cout << "\n" << pq1.top();

    /*NOTE: 
        push() and pop() ->log n
        top() -> O(1)
    */
}

int main() {
    explainPriorityQueue();
    return 0;
}