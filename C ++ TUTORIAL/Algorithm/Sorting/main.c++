#include<bits/stdc++.h>
using namespace std;

bool comp(pair<int,int> p1,pair<int,int> p2) {
    if((p1.second) < (p2.second)) return true;
    if((p1.second) > (p2.second)) return false;
    // ther are same

    if(p1.first) > (p2.first) return true;
    return false;
}


int main() {
    //Sorting
    vector<int> v = {45,23,98,76,12,46};
    sort(v.begin(),v.end());
    for(auto ele: v) {
        cout << ele << " ";
    }

    cout << "\n";
    // Soring in Desending Order
    // sort(v.begin(), v.end(), greater<int>);
    // for(auto ele: v) {
    //     cout << ele << " ";
    // }

    /*
        Sort it according to second element it second element is 
        same then sort it according to first element but in decending order
    */
   pair<int,int> arr[] = {{1,2},{2,1},{4,1}};
   sort(0,3,comp);
   // {4,1}, {2,1}, {1,2}

   // It says no of i's in the total bit like 7- 111 it return 3 or 6-> 110  return 2
   int num = 8;
   int cnt = __builtin_popcount(num);

   long long n =83458634856432;
   int cntl = __builtin_popcountll(n);
   return 0;
}