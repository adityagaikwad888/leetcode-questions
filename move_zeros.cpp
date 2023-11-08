#include <stdc++.h>
using namespace std;

void moveZeroes(vector<int>& nums) {
    for (int i = 0 ; i < nums.size() ; i++){
        for (int j = 0 ; j < nums.size() -1 ; j ++ ){
            if (nums.at(j) == 0)
                swap(nums.at(j),nums.at(j+1));
        }
    }
    for (int i = 0; i < nums.size() ; i++)
    {
        cout<<nums.at(i)<<" ";
    }
    
}
int main()
{
    vector<int> v;
    int a,x;
    cin>>a;
    for (int i = 0; i < a ; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    moveZeroes(v);
    
    return 0 ;
}