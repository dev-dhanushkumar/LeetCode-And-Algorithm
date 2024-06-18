#include<bits/stdc++.h>
using namespace std;

void explainMap() {
    /*
        Key are Unique but values are not Unique
        Map ->Unique and Sorted key Key Values
    */

   map<int, int> mpp;
   map<int, pair<int,int>> mpp1;
   map<pair<int,int>, int> mpp2;

   mpp[1] = 35;
   mpp.insert({3,7});
   mpp.emplace(2,57);
   for(auto ele: mpp) {
    cout << ele.first << ":" << ele.second << "\n";
   }

   mpp2[{2,3}] = 10;

   cout << "\n" << mpp[2];
   cout << "\n" << mpp[5]; /// not present key return 0 as output

   // Find the values uding Key
//    auto it  = mpp.find(5);
//    cout << *(it).second;

    auto it = mpp.lower_bound(2);
    auto it5 = mpp.upper_bound(3);

    // erase , swap, size, empty well as same 
}


int main() {
    explainMap();
    return  0;
}