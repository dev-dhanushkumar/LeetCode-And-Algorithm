#include<bits/stdc++.h>
using namespace std;
void explainSet() {
    set<int> st;  // Sorted values are stored and elements are unique not insert already present element
    st.insert(34);
    st.emplace(56);
    st.insert(12);
    st.insert(28);

    /* Functionality of insert in vector can be used also that only
    increase efficient
    
    begin(), end(), rbegin(), size(), empty() and swap() are same as those of aboves
    */

   auto it = st.find(12);
   cout << *(it);

   auto it1 = st.find(67); // it return the st.end() value
   cout << "\n" << *(it1);

   st.erase(12); // erase 12 // take logarithmic time

   int cnt = st.count(3); // check the length of set it return 0 amd 1

   auto it2 = st.find(28);
   st.erase(it2); // It takes Constant Time

   // Erase data in particular range
    st.insert(35);
    st.insert(14);
    st.emplace(72);
    cout << "\n";
    for(auto ele: st) {
        cout << ele << " ";
    }
   auto start = st.find(34);
   auto end = st.find(56);
   st.erase(start, end);

    cout << "\n";
   for(auto ele: st) {
    cout << ele << " ";
   }
}


int main() {
    explainSet();
    return 0;
}