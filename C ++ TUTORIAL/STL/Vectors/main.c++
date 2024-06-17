#include<bits/stdc++.h>
using namespace std;

void explainVectors() {

    // Declaration of Vectors
    vector<int> v;
    v.push_back(23);
    v.emplace_back(45);

    // Declaration vector with pair
    vector<pair<int,int>> vec;
    vec.push_back({900,90});
    vec.emplace_back(450,45);
    // cout << vec[0].first << " " << vec[0].second;

    // Declaration Vectors Size and insert values:
    vector<int> v1(5,100); //{100,100,100,100,100}
    vector<int> v2(5); // {0,0,0,0,0} or Carbage values based on compiler

    // Copy of vector to another vectors
    vector<int> v3(5,20);
    vector<int> v4(v3); // copy of v3 vector in v4
    
    // NOTE: After declared the size of the vectors we can change that size dynamically.


    // Iterator will take the vectors element Address to access that element.
    vector<int> vec1 = {34,67,90,12,24};
    vector<int>::iterator it = vec1.begin();
    it++;
    cout <<"it + 1 = " <<*(it) << " ";

    it = it + 2;
    cout <<"\nit + 2 value: "<< *(it) << " ";


    // Access end of elements
    vector<int>::iterator it1 = vec1.end();
    it1--;
    cout << "\nit1 end element: " << *(it1);

    // Print last element
    cout <<"\n" <<vec1.back() << " ";

    // Print vectors methods:
    cout << "\n";
    for(vector<int>::iterator it2 = vec1.begin(); it2 != vec1.end(); it2++) {
        cout << *(it2) << " ";
    }

    cout << "\n";
    for(auto it3 = vec1.begin(); it3 != vec1.end(); it3++){
        cout << *(it3)<< " ";
    }

    cout << "\n";
    for(auto it4: vec1) {
        cout << it4 << " ";
    }

    // Erase Element in Vector
    vec1.erase(vec1.begin() + 2);
    cout << "\n";
    for(auto it4: vec1) {
        cout << it4 << " ";
    }

    vec1.emplace_back(50);
    vec1.emplace_back(45);
    cout << "\n";
    for(auto it4: vec1) {
        cout << it4 << " ";
    }

    //Erase in particular Range
    vec1.erase(vec1.begin()+2, vec1.begin()+5);
    cout << "\n";
    for(auto it4: vec1) {
        cout << it4 << " ";
    }




    //Insert function in Vectors:
    vector<int> vec3(2,100);
    cout << "\n";
    for(auto it4: vec3) {
        cout << it4 << " ";
    }
    vec3.insert(vec3.begin(),300);
    cout << "\n";
    for(auto it4: vec3) {
        cout << it4 << " ";
    }

    vec3.insert(vec3.begin()+1,2,10);
    cout << "\n";
    for(auto it4: vec3) {
        cout << it4 << " ";
    }


    // Join Two vectors:
    vector<int> copy(2,50);
    vec3.insert(vec3.begin(),copy.begin(), copy.end());
    cout << "\n";
    for(auto it4: vec3) {
        cout << it4 << " ";
    }

    // Get size of vectors
    cout << "\n" << vec3.size();

    // Pop the Element
    vec3.pop_back();
    cout << "\n";
    for(auto it4: vec3) {
        cout << it4 << " ";
    }

    //Swap the Element
    // v1 -> {10,30}
    // v2 -> {20,40}
    // v1.swap(v2); v1->{20,40} v2-> {10,30}

    vec3.clear();

    cout <<"\n" << vec3.empty();
}

int main() {
    explainVectors();
    return 0;
}