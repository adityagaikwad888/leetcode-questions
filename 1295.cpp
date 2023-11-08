#include <stdc++.h>
using namespace std;

int findNumbers(vector<int> &nums){
    vector<string> str;
    for (int i = 0; i < nums.size(); i++)
    {
        int n = nums.at(i);
        str.push_back(to_string(n));
    }
    int count = 0;
    for (int i = 0; i < str.size(); i++)
    {
        if(str.at(i).length()%2==0)
            count++;   
    }
    return count;  
}

int main(){
    vector<int> v;
    int a,x;
    cin>>a;
    for (int i = 0; i < a; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    cout<<findNumbers(v)<<endl;
    return 0;
}