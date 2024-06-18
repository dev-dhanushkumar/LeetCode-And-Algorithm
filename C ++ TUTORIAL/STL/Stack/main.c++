#include<bits/stdc++.h>
using namespace  std;

void explainStack() {
    stack<int> st;
    st.push(23);
    st.push(45);
    st.push(83);
    st.push(10);
    st.push(67);
    cout << st.top() ;

    st.pop();
    cout <<"\n"<< st.top() ;

    // Print size of stack
    cout << "\n" << st.size();

    cout << "\n" << st.empty();

    /*stack<int> st1, st2;
      st1.swap(st2)
    */ 
    
}


int main() {
    explainStack();
    return 0;
}