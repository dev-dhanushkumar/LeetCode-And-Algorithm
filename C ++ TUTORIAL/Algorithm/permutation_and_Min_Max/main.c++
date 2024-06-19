#include<bits/stdc++.h>
using namespace std;

int main() {
    string s= "1247";
    do{
        cout << s << " ";
    } while(next_permutation(s.begin(),s.end()));

    int maxi = *max_element(s.begin(), s.end());
    cout << maxi;

    // int minx= *min_element(s.begin(), s.end());
}